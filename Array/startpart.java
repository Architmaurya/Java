package Array;

public class startpart {
    public static void main (String[] args){
        // Scanner in = new Scanner(System.in);
        int [][] arr = new int [4][];
        for (int i=0;i<arr.length;i++){
            for (int j=0 ;j<arr.length-i-1;j++){
                System.out.print(" ");
            } 
            for (int j=0;j<2*i+1;j++)
           {
              System.out.print("*");
           }
            System.out.println();
        }
       
    }
}
