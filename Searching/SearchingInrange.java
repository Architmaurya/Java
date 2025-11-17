package Searching;

public class SearchingInrange {
    public static void main (String[] args){
        int [] arr ={11,22,3,4,5,6,7,8};
        int target=3;
        System.out.println(Search(arr,target,1,4));
        
    }   
    
 static int Search(int [] arr ,int target ,int start ,int end){
        
        if(arr.length==0){
            return -1;
        }
        //run a for loop
        for (int index=start ; index<=end; index++){
            int element= arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}

