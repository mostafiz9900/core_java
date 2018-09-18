package BeSkilled;

import java.util.Scanner;

public class MakeSum2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n1: ");
        int n11 = input.nextInt();
//        System.out.println("Enter n : ");
//        String n = input.nextLine();
        System.out.println("Enter n2: ");
        int n22 = input.nextInt();
        System.out.println(mSum(n11, n22, str));
    }

    public static int mSum(int n1, int n2, String str) {
        int sr = 0;
        if (str == "+") {
            sr = n1 + n2;
        } else if (str == "-") {
            sr = n1 - n2;
        } else if (str == "*") {
            sr = n1 * n2;
        } else if (str == "/") {
            sr = n1 / n2;
        } else if (str == "%") {
            sr = n1 % n2;
        }
        return sr;
    }

}
