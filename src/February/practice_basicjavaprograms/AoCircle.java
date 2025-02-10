package February.practice_basicjavaprograms;

import java.util.Scanner;

public class AoCircle {
    public static void main(String[] args) {
        //Area of circle
        System.out.println("Enter thr radius of circle");
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        float area = (float) (3.14 * r *r);
        System.out.println(area);
    }
}
