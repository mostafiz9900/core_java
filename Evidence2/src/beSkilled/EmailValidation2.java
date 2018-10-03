package beSkilled;

import java.util.Scanner;

public class EmailValidation2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Email: ");
        String emil = input.nextLine();
        int atpos = emil.indexOf("@");
        int dtpos = emil.indexOf(".");
        if (atpos > 0 && dtpos < emil.length() - 1 && atpos < dtpos - 1) {
            System.out.println("Email valid");

        } else {
            System.out.println("Email invalid");
        }

    }
}
