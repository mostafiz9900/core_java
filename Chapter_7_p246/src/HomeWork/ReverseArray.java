package HomeWork;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int mm[] = {55, 2, 66, 45, 88, 5, 8, 44, 3};
//Sort array
        Arrays.sort(mm);
        for (int m : mm) {
            System.out.print(m + " ");

        }
        System.out.println("======================");
//Reversing array 
        int newArr[] = new int[mm.length];
        int j = 0;
        for (int i = mm.length - 1; i > 0; i--) {
            newArr[j] = mm[i];
            j++;

        }
        for (int k : newArr) {
            System.out.print(k + " ");//same line

        }
        System.out.println();//New line 
    }
}
