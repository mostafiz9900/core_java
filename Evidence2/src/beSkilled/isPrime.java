package beSkilled;

import java.math.BigInteger;
import java.util.Scanner;

public class isPrime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        isPrimeNum(input.nextInt());
    }

    static void isPrimeNum(int num) {
        if (BigInteger.valueOf(num).isProbablePrime(1)) {
            System.out.println("Is Prime");
        } else {
            System.out.println("Is not Prime");
        }
    }
}
