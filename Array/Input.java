package Array;
import java.util.Arrays;

import java.util.Scanner;

public class Input {
 public static void main (String[] args){
    Scanner im =new Scanner(System.in);
    // arrays of premivites
    // int [] arr = new int [5];
    // arr[0]=55;
    // arr[1]=44;
    // arr[2]=33;
    // arr[3]=22;
    // arr[4]=99;
    // System.out.println(arr[3]);
    // for(int i=0 ; i< arr.length ; i++){
    //     arr[i]=in.nextInt();
    // }
    // System.out.println(Arrays.toString(arr));
    // for (int i = 0 ;i < arr.length ;i++){
    //     // System.out.println(arr[i]);
        
    // }
    // array of object 
    String[] str= new String[4];
    for (int i =0 ; i<str.length; i++){
        str[i]=im.next();

    }
    System.out.println(Arrays.toString(str));
    //modify
    str[2]="Archit";
    System.out.println(Arrays.toString(str));
 }   
}
