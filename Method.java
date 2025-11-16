import java.util.Scanner;
public class Method {
    public static void main (String[] args){
        mymethod();
    }
static void mymethod(){
    Scanner in = new Scanner(System.in);
    int num1,num2,Sum;
    System.out.println("Enter two numbers to add:");
    num1=in.nextInt();
    num2=in.nextInt();
    Sum=num1+num2;
    System.out.println("The sum of the two numbers is: " + Sum);
}
    
}
