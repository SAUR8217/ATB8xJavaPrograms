package February.practice_basicjavaprograms;

import java.util.Scanner;

public class VoPyramid {

        public static void main(String[] args) {
            //Volume of Pyramid
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the lenght of Pyramid");
            float l = input.nextFloat();
            System.out.println("Enter the height of Pyramid ");
            float h = input.nextFloat();
            System.out.println("Enter the Width of Pyramid");
            float w = input.nextFloat();
            float Volume = (l*w*h)/3;
            System.out.println("Volume of Pyramid "+ Volume);

        }
    }


