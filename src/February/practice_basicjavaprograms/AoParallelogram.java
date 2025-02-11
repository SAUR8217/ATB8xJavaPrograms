package February.practice_basicjavaprograms;

import java.util.Scanner;

public class AoParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of parallelogram");
        float base = input.nextFloat();
        System.out.println("Enter the height of parallelogram");
        float height = input.nextFloat();
        float area = base * height;
        System.out.println("Area of parallelogram is "+ area);
    }
}
