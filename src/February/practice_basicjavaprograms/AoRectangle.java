package February.practice_basicjavaprograms;

import java.util.Scanner;

public class AoRectangle {
    public static void main(String[] args) {
        //Area of rectangle
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of rectangle");
        float l = input.nextFloat();
        System.out.println("Enter breadth of rectangle");
        float b = input.nextFloat();
        float area = l * b;
        System.out.println(area);

    }
}
