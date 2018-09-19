package exercises;

import java.util.Scanner;

public class AllCalculation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n1 ");
        int number1 = input.nextInt();

//         System.out.println("string");
//         String cl=input.nextLine();
        System.out.println("Enter n2");
        int number2 = input.nextInt();
        int ans = AllCalculation.makeSum2(number1, number2, "*");
        System.out.println(ans + " ");

    }

    public static int makeSum2(int n1, int n2, String str) {
        int rs = 0;
        if (str == "+") {
            rs = n1 + n2;
        } else if (str == "-") {
            rs = n1 - n2;
        } else if (str == "*") {
            rs = n1 * n2;
        } else if (str == "/") {
            rs = n1 / n2;
        } else if (str == "%") {
            rs = n1 % n2;
        }

        return rs;
    }
}
