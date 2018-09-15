package BeSkilled;

import java.util.Scanner;

public class CheckPoint_p168 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number  ");
        int number, max;
        number = input.nextInt();
        max = number;
        while (number != 0) {
            number = input.nextInt();

            if (number > max) {
                max = number;

            }

        }
        System.out.println("max number is " + max);
        System.out.println("number is " + number);
    }
}
