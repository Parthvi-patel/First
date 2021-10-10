import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the value of A & b");
        double a = s1.nextDouble();
        double b = s1.nextDouble();
      //submisstion of two numbers
        double c= a+b;
        System.out.println("submission="+c);

        c=a-b;
        System.out.println("Subtraction="+c);
    }


}
