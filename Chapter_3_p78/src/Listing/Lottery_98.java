package Listing;

import java.util.Scanner;

public class Lottery_98 {

    public static void main(String[] args) {
        int lottery = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your lottary number");
        int guess = input.nextInt();

        int lotteryDigiyt1 = lottery / 10;
        int lotteryDigiyt2 = lottery % 10;

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;
        System.out.println("The lottery number is : " + lottery);

        if (guess == lottery) {
            System.out.println("Exact match: you win 10,000");
        } else if (guessDigit2 == lotteryDigiyt1
                && guessDigit1 == lotteryDigiyt1) {
            System.out.println("Exact match: you win 3000");
        } else if (guessDigit1 == lotteryDigiyt1
                || guessDigit1 == lotteryDigiyt2
                || guessDigit2 == lotteryDigiyt1
                || guessDigit2 == lotteryDigiyt2) {
            System.out.println("Match one digit" + 1000);
        } else {
            System.out.println("Invalit number");
        }

    }
}
