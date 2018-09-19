package exercises;

import java.util.Scanner;

public class MakeSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n1 ");
        int number1 = input.nextInt();
        System.out.println("Enter n2");
        int number2 = input.nextInt();
        System.out.println(makeSum(number1, number2));

    }

    public static int makeSum(int n1, int n2) {
        int sum = 0;
        if (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                for (int i = n1; i >= n2; i--) {
                    sum += i;

                }

            } else if (n1 < n2) {
                for (int i = n1; i <= n2; i++) {
                    sum += i;

                }
            } else if (n1 == n2) {
                sum = n1;
            }

        } else {
            sum = -1;

        }
        return sum;
    }

}
