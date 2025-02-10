package February.practice_basicjavaprograms;

import java.util.Scanner;

public class AoSquare {
    public static void main(String[] args) {
        //Area of square
        Scanner input = new Scanner(System.in);
        System.out.println("Enter side of square");
        float side = input.nextFloat();
        float area = side * side;
        System.out.println(area);
    }
}
