package BeSkilled;

import java.util.Scanner;

public class MakeSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n1: ");
        int n1 = input.nextInt();
        System.out.println("Enter n2: ");
        int n2 = input.nextInt();
        
        System.out.println(mSum(n1, n2));

    }

    public static int mSum(int n1, int n2) {
        int sum = 0;
        if (n1 > 0 && n2 > 0) {
            if (n1 > n2) {
                for (int i = n1; i >= n2; i--) {
                    sum += i;

                }
            } else if (n1 < n2) {
                for (int i = n1; i <= n2; i++) {
                    sum += i;

                }
            } else if (n1 == n2) {
                sum = n1;
            } else {
                sum = -1;
            }

        }
        return sum;
    }
}
