package February.practice_basicjavaprograms;

import java.util.Scanner;

public class PoCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of circle ");
        float radius = input.nextFloat();
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of circle is "+ perimeter );

    }
}
