
package BeSkilled;

import java.util.Arrays;


public class ArraySorting_ {

    public static void main(String[] args) {
        int[] x = {1, 5, 8, 6, 8, 10, 4, 5, 45, 55, 55, 45, 5, 5, 55};
        Arrays.sort(x);
        MethodPassingArrays_257.displayArray(x);
        System.out.println();
        for (int i : x) {
            System.out.print(i + " ");
            
        }
        System.out.println();
    }
}
