package beSkilled;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class ArrayAssenDesend {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Array size: ");
        int arrSize = input.nextInt();
        Integer[] arr = new Integer[arrSize];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            
        }
        Arrays.sort(arr);
        Collections.reverse(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));
    }
}
