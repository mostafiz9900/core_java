package BeSkilled;

import java.util.Arrays;

public class ArrayReversre {

    public static void main(String[] args) {
        int x[] = {4, 1, 8, 6};

        Arrays.sort(x);
        for (int m : x) {
            System.out.println(m + " ");

        }
        int newArray[] = new int[x.length];
        int j = 0;

        for (int i = x.length - 1; i >= 0; i--) {
            newArray[j] = x[i];
            j++;

        }
        for (int k : newArray) {
            System.out.print(k + " ");

        }
    }
    
}
