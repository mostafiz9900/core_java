package beSkilled;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Array size: ");
        int arraSiz = input.nextInt();
        Integer[] arr = new Integer[arraSiz];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            
        }
        Arrays.sort(arr);
    }
}
