/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeSkilled;

import java.util.Scanner;

/**
 *
 * @author Mostafizur
 */
public class SentinelValue_166 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer (the input ends if it is 0) ");
        int data = input.nextInt();
        int sum = 0;
        while (data != 0) {
            sum += data;
            System.out.print("integer (the input ends if it is 0) ");
            data = input.nextInt();

        }
        System.out.println("The sum is " + sum);
    }
}
