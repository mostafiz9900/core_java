package beSkilled;

import java.util.Scanner;

public class OldEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        oldEven(input.nextInt());
    }

    public static void oldEven(int num) {
        if (num == 0) {
            System.out.println("Zero number");

        } else {
            if (num % 2 == 0) {
                System.out.println("Old numbe");

            } else {
                System.out.println("Even Number");
            }
        }
    }
}
