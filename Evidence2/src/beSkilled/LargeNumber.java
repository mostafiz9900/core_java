package beSkilled;

import java.util.Scanner;

public class LargeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        largeNum(input.nextInt(),input.nextInt(),input.nextInt());
    }

    static void largeNum(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            System.out.println("N1 is large number:");

        } else if (n2 > n1 && n2 > n3) {
            System.out.println("N2 is large number:");

        } else if (n3 > n1 && n3 > n2) {
            System.out.println("N3 is large number:");

        } else {
            System.out.println(n1 + " , " + n2 + " , " + n3 + "is equal");
        }
    }
}
