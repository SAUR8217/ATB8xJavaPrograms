package February.practice_basicjavaprograms;

import java.util.Scanner;

public class AoEquilateraltriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float side = input.nextFloat();
        double area = (Math.sqrt(3)/4)*(Math.pow(side, 2));
        System.out.println("Area of Equilateral triangel is "+ area);
    }
}

