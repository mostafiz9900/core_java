package beSkilled;

import java.util.Scanner;

public class ComputeFibonacci_710 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        fib(num);
        System.out.println(" The fibonacci number at index " + num + " is " + fib(num));
    }

    public static long fib(long n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
