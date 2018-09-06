
package Listing;

import java.util.Scanner;

public class EventNumber {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner (System.in);
        System.out.println("Enter Number");
        int num = inputNumber.nextInt();
         if (num % 2 == 0){
             System.out.println("Event Number " + num);
         }else {
             System.out.println("Old Number " + num);}
    }
}
