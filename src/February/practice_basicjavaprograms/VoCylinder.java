package February.practice_basicjavaprograms;

import java.util.Scanner;

public class VoCylinder {
    public static void main(String[] args) {
        //Volume of Cylinder
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder");
        float r = input.nextFloat();
        System.out.println("Enter the height of Cylinder ");
        float h = input.nextFloat();
        float Volume = (float)(Math.PI*Math.pow(r,2)*h);
        System.out.println("Volume of Cylinder "+ Volume);

    }
}
