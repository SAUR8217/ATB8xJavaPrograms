package February.ex_04022025;

import java.util.Scanner;

public class Lab007_grade {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the score");
        int Score = a.nextInt();
        //int Score = 69;
        String grade = Score >= 90 ? "A" :  Score >= 80 ? "B" : Score >= 70 ? "C" : "D" ;
        System.out.println(grade);
    }
}
