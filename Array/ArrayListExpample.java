package Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExpample {
  public static void main (String[] args){

    Scanner in =new Scanner(System.in);
      //Syntax
      ArrayList<Integer>list = new ArrayList<>(10);
    //   list.add(10);
    //   list.add(29);
    //    list.add(13);
    //   list.add(22);
    //    list.add(133);
    
    //   list.set(1,100);

    //   System.out.println(list.contains(1045));
    //   System.out.println(list);

      for (int i= 0 ;i<5 ; i++){
        list.add(in.nextInt());
      }
      //get the item at any index have to pass the index over there 

      for (int i=0; i<5;i++){
        System.out.println(list.get(i));//pass index here ,list [index] syntax will not work here 
      }


  }

    
}
