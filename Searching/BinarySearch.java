package Searching;

public class BinarySearch {
    public static void main (String[] args){
        int [] arr ={-18,-12,-4,0,2,4,5,6,7,8,9};
        int target=-4;
        int ans=binarySearch(arr, target);
        System.out.println(ans);
    }
    //return the index 
    static int  binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            //find the middle element
         //   int mid =(start+end)/2; //might be possible that (start+end)ex

         int mid =start + (end-start)/2;
         if(target< arr[mid]){
            end=mid-1;
         }
         else if (target>arr[mid]){
            start=mid+1;
         }else{
            return mid;
         }
            
        }
        return -1;
    }
}
