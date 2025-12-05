package Searching;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int [][] arr={
            {10,40,70},
            {20,50,80},
            {30,60,90}
        };
        System.out.println(Arrays.toString(search(arr,50)));
        
    }
    static int[] search(int [][] matrix,int target){
        int r=0;
        int c=matrix.length-1;
        while (r<matrix.length && c>=0) {
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            if(matrix[r][c]<target){
                r++;
            }else{
                c--;
            }
        }
        return new int []{-1,-1};
    }
}
