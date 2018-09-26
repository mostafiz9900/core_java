package beSkilled;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        for (int i = 1; i < num; i++) {
            if (num % 2 == 0) {
                System.out.println("is prime number");

            } else {
                System.out.println("is not prime number");
            }

        }
    }

}
