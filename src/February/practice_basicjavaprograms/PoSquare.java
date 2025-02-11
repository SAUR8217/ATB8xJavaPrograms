package February.practice_basicjavaprograms;

import java.util.Scanner;

public class PoSquare {
    public static void main(String[] args) {
        //Perimeter of Square / rhombus.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a side of square");
        float side = input.nextFloat();
        float perimeter = 4*side;
        System.out.println("Perimeter of square is "+ perimeter);
    }
}
