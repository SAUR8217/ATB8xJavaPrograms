package January.ex_01022025;

public class Lab06_typecast_narrowing {
    public static void main(String[] args) {
        //explicit typecasting (Narrowing)
        int box_a = 258;
        byte box_b = (byte)box_a;
        System.out.println((int) box_b);
    }
}
