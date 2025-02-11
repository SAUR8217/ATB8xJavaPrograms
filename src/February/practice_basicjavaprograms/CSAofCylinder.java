package February.practice_basicjavaprograms;

import java.util.Scanner;

public class CSAofCylinder {
    //Curved surface area of Cylinder
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius and height of cylinder");
        float r = input.nextFloat();
        float h = input.nextFloat();
        float csa = (float) (2*Math.PI*r*h);
        System.out.println("CSA of cylinder is "+ csa);
    }
}
