package February.practice_basicjavaprograms;

import java.util.Scanner;

public class AoisoTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of triangle");
        float base = input.nextFloat();
        System.out.println("Enter the height of triangle");
        float height = input.nextFloat();
        float area = (float) 1/2 * base * height;
        System.out.println("Area of isosceles triangle is "+ area);
    }
}
