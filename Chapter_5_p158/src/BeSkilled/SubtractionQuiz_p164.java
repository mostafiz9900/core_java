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
            System.out.println("");
        }

    }
}
