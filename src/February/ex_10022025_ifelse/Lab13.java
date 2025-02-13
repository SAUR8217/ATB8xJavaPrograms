package February.ex_10022025_ifelse;

import java.util.Scanner;

public class Lab13 {
    public static void main(String[] args) {
        //Greatest number in 3 numbers
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (b>a&&b>c){
            System.out.println("The greatest number is "+b);
        }else if (a>b&&a>c){
            System.out.println("The greatest number is "+a);
        }else
            System.out.println("The greatest number is "+c);
    }
}
