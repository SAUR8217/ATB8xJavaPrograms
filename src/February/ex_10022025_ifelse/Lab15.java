package February.ex_10022025_ifelse;

import java.util.Scanner;

public class Lab15 {
    public static void main(String[] args) {
        //Leap year program
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = input.nextInt();
        if (year % 400 == 0){
            System.out.println("Its a leap year");
        } else if (year%100==0) {
            System.out.println("Its not a leap year");
        }else if (year % 4 == 0) {
            System.out.println("Its a leap year");
        }
    }
}
