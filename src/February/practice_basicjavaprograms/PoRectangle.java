package February.practice_basicjavaprograms;

import java.util.Scanner;

public class PoRectangle {
    public static void main(String[] args) {
        //Perimeter of rectangle
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        float lenght = input.nextFloat();
        System.out.println("Enter the Width of rectangle");
        float width = input.nextFloat();
        float perimeter = 2*(lenght+width);
        System.out.println("Perimeter of rectangle is "+perimeter);
    }
}
