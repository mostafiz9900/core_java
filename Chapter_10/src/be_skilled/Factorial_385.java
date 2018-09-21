package be_skilled;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial_385 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number ");
        long num = input.nextLong();
        System.out.println("50! is \n" + factorial(num));

    }

    public static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + ""));

        }
        return result;

    }
}
