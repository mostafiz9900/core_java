package beSkilled;

import java.math.BigInteger;
import java.util.Scanner;

public class EmailValidation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        isPrim(input.nextInt());

    }

    static void isPrim(int num) {
        BigInteger f = BigInteger.valueOf(1);
        for (int i = 1; i <= num; i++) {
            f = f.multiply(BigInteger.valueOf(i));

        }
        System.out.println(f);
    }
}
