package beSkilled;

import java.util.Scanner;

public class GCDEudid {

    static int gcd(int m, int n) {
        if (m % n == 0) {
            return n;

        } else {
            return gcd(n, m % n);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First integer : ");
        int m = input.nextInt();
        System.out.println("Enter secent integer : ");
        int n = input.nextInt();

        System.out.println("The greatest common divisor for " + m + " and " + n + " is " + gcd(m, n));
    }

}
