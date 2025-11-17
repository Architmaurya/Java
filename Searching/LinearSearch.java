package Searching;
// import java.util.Scanner;

public class LinearSearch {
    public static void main (String[] args){
        // Scanner in = new Scanner(System.in);
      
        int [] nums = {1,22,44,55,33,66,77};
        int target =0;
        int ans = Search(nums ,target);
        System.out.println(ans);
        // boolean found = false;

        // for (int i =0 ;i<arr.length; i++ ){
        //    if(num==arr[i]){
        //     found=true;
        //     System.out.print("the value is found " +  arr[i]);
        //     break;
        //    }      
        // }
        // if(!found){
        //       System.out.print("The value is not found");
        // }
    }
    //search in the Array :return the index if item found 
     
    static int Search(int [] arr ,int target){
        
        if(arr.length==0){
            return -1;
        }
        //run a for loop
        for (int index=0 ; index<arr.length; index++){
            int element= arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
        
    }

