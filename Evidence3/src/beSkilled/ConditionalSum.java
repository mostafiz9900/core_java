package beSkilled;

import java.util.Scanner;

public class ConditionalSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int sum = 0;
        for (int i = 0;; i++) {
            int num = input.nextInt();
            if (num > -5) {
                sum += num;

            } else {
                System.out.println(sum);
            }

        }
    }
}
