package February.ex_08022025_switchcase;

import java.util.Scanner;

public class Lab011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the choice");
        int choice = input.nextInt();
        System.out.println("Enter the number to convert");
        float value = input.nextFloat();
        switch (choice){
            case 1:
                System.out.println("Kilometer to mile conversion = "+value/1.6093445+" miles");
                break;
            case 2:
                System.out.println("Degree celsius to  = "+((value*1.8)+32)+" F");
                break;
            default:
                System.out.println("Enter correct choice");
        }
    }
}
