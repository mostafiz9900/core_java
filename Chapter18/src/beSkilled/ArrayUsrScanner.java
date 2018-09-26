package beSkilled;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class ArrayUsrScanner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entere a length: ");
        int arrSize = input.nextInt();
        Integer[] arr = new Integer[arrSize];
        System.out.println("Array index: ");

        for (int i = 0; i < arr.length; i++) {

            arr[i] = input.nextInt();

        }
        Arrays.sort(arr);
        Collections.reverse(Arrays.asList(arr));//reverse use integer korte hobe
        System.out.println(Arrays.toString(arr));

    }
}
