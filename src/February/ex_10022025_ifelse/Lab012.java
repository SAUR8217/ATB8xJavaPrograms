package February.ex_10022025_ifelse;

import java.util.Scanner;

public class Lab012 {
    public static void main(String[] args) {
        //Determine the type of triangle
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First side of triangle");
        int side1 = input.nextInt();
        System.out.println("Enter the Second side of triangle");
        int side2 = input.nextInt();
        System.out.println("Enter the Third side of triangle");
        int side3 = input.nextInt();
        if(side1 == side2 && side1 == side3) {
            System.out.println("The triangle is an Equilateral triangle");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is an isosceles triangle");
        } else {
            System.out.println("The triangle is a Scalene triangle");
        }
    }
}
