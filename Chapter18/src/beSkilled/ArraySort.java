package beSkilled;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        int[] a = {5, 4, 8, 1};
        Arrays.sort(a);
        for (int j : a) {
            System.out.println(j);
        }
        System.out.println("array decending order");

        int[] b = {5, 4, 8, 1};

        Arrays.sort(b);

        for (int i = b.length - 1; i >= 0; i--) {
            System.out.println(b[i] + " ");

        }
    }
}
