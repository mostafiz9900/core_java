package beSkilled;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinNumber {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter length");
        int n = input.nextInt();
        Integer[] arr = new Integer[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();

        }
        Arrays.sort(arr);
        System.out.println("Min " + arr[0] + "Min " + arr[arr.length - 1]);
    }

}
