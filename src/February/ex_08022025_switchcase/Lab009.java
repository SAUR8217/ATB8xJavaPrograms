package February.ex_08022025_switchcase;

import java.util.Scanner;

public class Lab009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first value");
        int a = input.nextInt();
        System.out.println("Enter the operator");
        String o = input.next();
        System.out.println("Enter second value");
        int b = input.nextInt();
        switch (o){
            case "+":
                System.out.printf("The addition is %d",a+b);
                break;
            case "-":
                System.out.printf("The Substraction is %d",a-b);
                break;
            case "*":
                System.out.printf("The Multiplication is %d",a*b);
                break;
            case "/":
                System.out.printf("The division is %d",a/b);
                break;
            case "%":
                System.out.printf("The Modulus is %d",a/b);
                break;
            default:
                System.out.printf("Please enter valid operator");
                break;

        }

    }
}
