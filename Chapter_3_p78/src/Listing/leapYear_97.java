
package Listing;

import java.util.Scanner;


public class leapYear_97 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year");
        double year = input.nextDouble();
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + "  is leap   " + isLeapYear);
    }
}
