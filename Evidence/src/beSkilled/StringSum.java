package beSkilled;

import java.util.Scanner;

public class StringSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Input");
//     int x=input.nextInt();
//     int y=input.nextInt();
        String s = input.nextLine();
        char ch = s.charAt(2);
        System.out.println("The character entered is: " + ch);
    }

}
