package February.practice_basicjavaprograms;

import java.util.Scanner;

public class PoEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a side of a Equi_triangle ");
        float side = input.nextFloat();
        float perimeter = 3*side;
        System.out.println("Perimeter of Equilateral triangle is "+ perimeter);

    }
}
