package BeSkilled;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = input.nextInt();
        System.out.println("Enter num 2");
        int num2 = input.nextInt();

    }

    public static int displaySum(int n1, int n2) {
        int sum = 0;
        if (n1 > 0 || n2 > 0) {
            if (n1 > n2) {
                for (int i = n1; i > n2; i--) {
sum--;
                }

            } else if (n1 > n2) {
                for (int i = n1; i > n2; i++) {
                    sum++;
                }

                }
            }

            return sum;
        }

    }
