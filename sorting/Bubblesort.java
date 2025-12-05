package sorting;


import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void bubble(int[] arr){
        boolean swappred;
        //run the step n-1 times 
        for (int i =0 ;i<arr.length; i++){
            swappred=false;
            //for each  step ,max item will come at the last respective index 
            for(int j=1;j<arr.length-i;j++){
                //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp =arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swappred=true;
                }
            }
            //if you did not swap for a particular 
            if(swappred==false){
                break;
            }
        }
    }
}
