package beSkilled;

import java.util.Arrays;

public class ArrayMultiDySort {

    public static void main(String[] args) {
        int arr[][] = {
            {8, 2, 6, 3}, {5, 44, 3, 8}
        };
        for (int[] one : arr) {
            Arrays.sort(one);
            for (int i : one) {
                System.out.print(i + " ");

            }

        }
    }
}
