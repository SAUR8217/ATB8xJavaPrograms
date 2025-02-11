package February.practice_basicjavaprograms;

import java.util.Scanner;

public class VoSphere {
    public static void main(String[] args) {
        //Volume of Sphere
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of Sphere");
        float r = input.nextFloat();
        double Volume = Math.PI*Math.pow(r,3)*4/3;
        System.out.println("Volume of Sphere "+ Volume);

    }
}
