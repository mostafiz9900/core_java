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
public class SubtractionQuiz_p164 {

    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0;
        int count = 0;

        long startTime = System.currentTimeMillis();
        String output = "";
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);

            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.println("What is " + number1 + "-" + number2 + "?");
            int answer = input.nextInt();
            //grade the answer and display the result 
            if (number1 - number2 == answer) {
                System.out.println("You are correct!! ");
                correctCount++; //increase the correct answer count

            } else {
                System.out.println("you are answer wrong.\n " + number1 + "-" + number2 + "Shout be" + (number1 - number2));
                //increment the count++
                count++;
                output += "\n" + number1 + "-" + number2 + "=" + answer + ((number1 - number2 == answer) ? "correct" : "wrong");
            }
            long endTime = System.currentTimeMillis();
            long testTime = endTime - startTime;
            System.out.println("Correct count is " + correctCount + "\nTest time is " + testTime / 1000 + "seconds\n" + output);
        }

    }
}
