package beSkilled;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMaxValu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ente array size");
        int arrSize = input.nextInt();
        Integer[] arr = new Integer[arrSize];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            sum +=i;
            
        }
       
        Arrays.sort(arr);
        System.out.println("Min " + arr[0] + " Max " + arr[arr.length - 1]);
        System.out.println(sum);
    }
}
