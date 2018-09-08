/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listing;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ternaryOparetor_103 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number ");
        int num = input.nextInt();
        System.out.println((num % 2 == 0) ? num+  " snum is evend : " : num + " num is old: ");

    }
}
