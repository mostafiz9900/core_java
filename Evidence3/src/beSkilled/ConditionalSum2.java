package beSkilled;

import java.util.Scanner;

public class ConditionalSum2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter input");
        int sum = 0;
        for (int i = 0;; i++) {
            int num = input.nextInt();
            if (num > 0) {
                sum += num;

            } else {
                System.out.println("Total sum: " + sum);
            }

        }
    }
}
