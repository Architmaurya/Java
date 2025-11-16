package Array;
import java.util.Arrays;
import java.util.Scanner;
public class MultiDimension {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        /*
          1 2 3 
          4 5 6
          7 8 9
         */
        // int [][] arr = {
        //     {1,2,3}, // 0th index
        //     {4,5,6}, // 1th index
        //     {7,8,9}  // 2nd index or {7,8,9,0}
        // };
        //   System.out.print(arr[0][1]); output:2 
        int[][] arr = new int[3][3];
        for (int row=0 ; row < arr.length; row++){
            //for each col in every row take the size of the col 
            for(int col=0 ;col<arr[row].length;col++){
                arr[row][col]=in.nextInt(); 
    
            }
           
        };
        // for (int row = 0 ;row<arr.length; row ++){
        //     for(int col = 0 ; col<arr[row].length ;col++ ){
        //         System.out.print(arr[row][col] + " ");
        //     }
        //      System.out.println();
        // }
        for (int row =0; row < arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));
        }
       
    }
    
}
