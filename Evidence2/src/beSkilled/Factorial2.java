package beSkilled;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        gitFactor(input.nextInt());
    }

    static void gitFactor(int n) {
        BigInteger f = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));

        }
        System.out.println(f);
    }
}
