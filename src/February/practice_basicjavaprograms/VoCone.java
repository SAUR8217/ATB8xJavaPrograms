package February.practice_basicjavaprograms;

import java.util.Scanner;

public class VoCone {
    public static void main(String[] args) {
        //Volume of Cone
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the cone");
        float r = input.nextFloat();
        System.out.println("Enter the height of the cone");
        float h = input.nextFloat();
        float Volume = (float) (Math.PI *Math.pow(r,2)*h/3);
        System.out.println("Volume of cone is "+ Volume);
        }
    }
