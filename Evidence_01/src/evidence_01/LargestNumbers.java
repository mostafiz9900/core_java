package evidence_01;

import java.util.Scanner;

public class LargestNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        isLargerstNumber(input.nextInt(), input.nextInt(), input.nextInt());
        System.out.println("======");

    }

    static void isLargerstNumber(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            System.out.println(n1 + " n1 is large number: ");

        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " n2 is large number:");

        } else if (n3 > n1 && n3 > n2) {
            System.out.println(n2 + " n3 is large number:");

        } else {
            System.out.println(n1 + " " + n2 + " " + n3);
        }
    }

}
