package February.practice_basicjavaprograms;

import java.util.Scanner;

public class PoParallelogram {
    public static void main(String[] args) {
        //Perimeter of Parallelogram
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of Parallelogram ");
        float side = input.nextFloat();
        float Perimeter = 4 * side;
        System.out.println("The Perimeter of Parallelogram is "+ Perimeter);
    }
}
