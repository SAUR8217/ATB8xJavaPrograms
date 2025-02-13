package February.ex_10022025_ifelse;

import java.util.Scanner;

public class Lab14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        double n = input.nextDouble();
        if (n > 0){
            if (n < 1){
                System.out.println("Positive small number");
            } else if (n > 1000000) {
                System.out.println("Positive large number");
            }else
                System.out.println("Positive number");
        } else if (n == 0) {
            System.out.println("Zero");
        }else
            System.out.println("Negative number");
    }
}