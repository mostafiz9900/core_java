package BeSkilled;

import java.util.Scanner;

public class AnalyzeNumbers_253 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n = input.nextInt();
        double number[] = new double[n];
        double sum = 0;
        System.out.println(" Enter the number: ");
        for (int i = 0; i < n; i++) {
            number[i] = input.nextDouble();
            sum += number[i];

        }
        double average = sum / n;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (number[i] > average) {
                count++;
                System.out.println("Average is: " + average);
                System.out.println("Number of elements above the average is " + count);

            }

        }
    }
}
