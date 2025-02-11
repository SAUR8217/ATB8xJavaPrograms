package February.practice_basicjavaprograms;

import java.util.Scanner;

public class SAoCube {
    public static void main(String[] args) {
        //Surface area of cube
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of cube");
        float side = input.nextFloat();
        float SAocube = (float) (6*Math.pow(side,2));
        System.out.println("Surface area of cube is "+SAocube);
    }
}
