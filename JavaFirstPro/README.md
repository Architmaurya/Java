# JavaFirstPro — Upgrade to Java 21 (manual steps)

This project is a small Java example. The automated Copilot upgrade tools are not available in this environment, so follow these manual steps to upgrade the development runtime to Java 21 (latest LTS) and verify the project builds.

## 1) Install JDK 21

Recommended distributions:
- Eclipse Temurin / Adoptium: https://adoptium.net
- Microsoft Build of OpenJDK / Temurin mirrors

Download and install the JDK for your platform (Windows x64). After install, set `JAVA_HOME` to the JDK21 install folder and add `%JAVA_HOME%\\bin` to your `PATH`.

In PowerShell (run as Administrator), example:

```powershell
# set JAVA_HOME for the current session (replace path with your install)
$env:JAVA_HOME = 'C:\\Program Files\\Eclipse Adoptium\\jdk-21'
$env:PATH = "$env:JAVA_HOME\\bin;" + $env:PATH

# verify
java -version
javac -version
```

If the output shows a 21.x version, you're ready.

## 2) Build and run the project

From this project root (`JavaFirstPro`) you can use the included helper `compile.ps1`:

```powershell
./compile.ps1
```

That script will check `java`/`javac` availability, compile `.java` files and run `Main`.

## 3) If you use a build tool (Maven/Gradle)

If you convert this project to Maven or Gradle later, update the `maven.compiler.source` and `maven.compiler.target` (or Gradle `java` toolchain) to 21.

Example (Maven):

```xml
<properties>
  <maven.compiler.source>21</maven.compiler.source>
  <maven.compiler.target>21</maven.compiler.target>
</properties>
```

## 4) Notes and next steps

- If compilation fails, check the source/target compatibility or language features used.
- Run tests or add a simple unit test harness if you need automated verification.
- Once verified, update repository README and CI to use JDK 21.

---
If you want, I can:
- generate a Maven or Gradle build file for this project and set it to Java 21, then run a local build (if you allow running the build here), or
- create a small Git commit patch updating README/CI files.
