package Listing;

import java.util.Scanner;

public class ExamMark_p82 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("Enter an Marks");
        if (num >= 80 && num < 100) {
            System.out.println("A+");
        } else if (num >= 70 && num < 80) {
            System.out.println("A");
        } else if (num >= 60 && num < 70) {
            System.out.println("A-");
        } else if (num >= 50 && num < 60) {
            System.out.println("B");
        } else if (num >= 40 && num < 50) {
            System.out.println("C");
        } else if (num >= 33 && num < 40) {
            System.out.println("D");
        } else if (num >= 1 && num < 32) {
            System.out.println("F");
        } else {
            System.out.println("Invalot Number");
        }
    }
}
 