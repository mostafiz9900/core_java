package Listing;

import java.util.Scanner;

public class IfStatements {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter obtain number");

        float obtainMark = input.nextFloat();
        if (obtainMark >= 70 && obtainMark < 80) {
            System.out.println(" Grade A ");
        } else if (obtainMark >= 80 && obtainMark < 100) {
            System.out.println(" Grade A + ");
        } else if (obtainMark >= 0 && obtainMark < 70) {
            System.out.println(" Grade F ");
        } else {
            System.out.println("Invalid Number");
        }

    }
}
