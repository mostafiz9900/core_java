package BeSkilled;

import java.util.Scanner;

public class GuessNumber_162 {

    public static void main(String[] args) {
        int number = (int) (Math.random() * 101);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number netween 0 and 100");

        int guess = -1;
        while (guess != number) {
            System.out.println("\nEnter your guess: ");
            guess = input.nextInt();

            if (guess == number) {
                System.out.println("Yes the number is " + number);

            } else if (guess > number) {
                System.out.println("you guess number is high");

            } else {
                System.out.println("your guess is too low");
            }

        }

    }
}
