package February.practice_basicjavaprograms;

import java.util.Scanner;
public class AoRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of Rhombus");
        float base = input.nextFloat();
        System.out.println("Enter the height of Rhombus");
        float height = input.nextFloat();
        float area = base * height;
        System.out.println("Area of Rhombus is "+ area);
    }
}
