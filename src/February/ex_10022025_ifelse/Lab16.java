package February.ex_10022025_ifelse;

import java.util.Scanner;

public class Lab16 {
    public static void main(String[] args) {
        //Check weather its number ,character or special character
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice");
        int A = input.next().charAt(0);
        if (A>='a'&&A<='z'||A>='A'&&A<='Z'){
            System.out.println("Its a character");
        } else if (A>='0'&&A<='9') {
            System.out.println("Its a Number");
        }else
            System.out.println("This is a special character");
    }
}
