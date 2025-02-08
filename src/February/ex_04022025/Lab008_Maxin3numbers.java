package February.ex_04022025;

import java.util.Scanner;

public class Lab008_Maxin3numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int a1 = a < b ? b : a ;
        int max = c > a1 ? c : a1;
        System.out.printf("Maximum in three numbers is %d",max);
        //System.out.println(b);
    }
}
