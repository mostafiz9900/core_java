package beSkilled;

import java.util.Scanner;

public class PassWord {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String passWd = input.nextLine();
        if (passWd.length() >= 7 ) { //&& passWd.length() <= 10  use this as your wish 
            System.out.println("PassWord Valid");

        } else {
            System.out.println("PassWort invalid");
        }
    }

}
