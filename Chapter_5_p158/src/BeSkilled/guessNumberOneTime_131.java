/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeSkilled;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class guessNumberOneTime_131 {

    public static void main(String[] args) {
        int number = (int) (Math.random() * 101);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a nagic number between 0 and 100");

        System.out.print("\nEntet your guess ");
        int guess = input.nextInt();

        //anly if condition use so input one time result return
        if (guess == number) {
            System.out.println("Yes the number is " + number);
        } else if (guess > number) {
            System.out.println("Your guess is too hogh ");

        } else {
            System.out.println("You guess is low");
        }

    }
}
