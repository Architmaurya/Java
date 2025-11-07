#!/usr/bin/env pwsh
# Simple build/run helper for Windows PowerShell

Push-Location $PSScriptRoot

function Check-Java {
    try {
        $jv = & java -version 2>&1
        $cv = & javac -version 2>&1
        Write-Host "java: $jv"
        Write-Host "javac: $cv"
    } catch {
        Write-Error "java or javac not found. Please install JDK 21 and set JAVA_HOME and PATH as described in README.md"
        Exit 1
    }
}

Check-Java

$srcDir = Join-Path $PSScriptRoot '.'
$outDir = Join-Path $PSScriptRoot 'out'
if (!(Test-Path $outDir)) { New-Item -ItemType Directory -Path $outDir | Out-Null }

$javaFiles = Get-ChildItem -Path $srcDir -Filter *.java -File
if ($javaFiles.Count -eq 0) {
    Write-Error "No .java files found in project root."
    Exit 1
}

Write-Host "Compiling $($javaFiles.Count) .java files to $outDir"

$fileList = $javaFiles | ForEach-Object { $_.FullName }

& javac -d $outDir @($fileList) 2>&1 | ForEach-Object { Write-Host $_ }
if ($LASTEXITCODE -ne 0) {
    Write-Error "Compilation failed."
    Exit $LASTEXITCODE
}

Write-Host "Compilation successful. Running Main..."

& java -cp $outDir Main

Pop-Location
