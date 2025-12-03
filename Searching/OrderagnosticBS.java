package Searching;

public class OrderagnosticBS {
    public static void main (String[] args){
        int [] arr ={10,20,30,40,50,60,70,80,90,100};
        int target =80;
        int ans =orderagnostic(arr, target);
        System.out.println(ans);
      
    }
    static int orderagnostic(int [] arr ,int target){
        int start=0;
        int end =arr.length-1;
        //find  whether the array is sorted or not in asc or dec
        boolean isAsc=arr[start]<arr[end];
        while (start<=end) {
            int mid=start+(end-start)/2;
            if (arr[mid]==target){
                return mid;
            }
            if(isAsc){
              if(target<arr[mid]){
                end=mid-1;
            }
                else
                {
                start=mid+1;
               }
         
            }else{
                 if(target>arr[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
      
    }
      return -1;
}
}
