package HomeWork;

import BeSkilled.MethodPassingArrays_257;
import java.util.Arrays;

public class SortingArray {

    public static void main(String[] args) {
        int y[] = {1, 2, 5, 4, 1, 36, 44, 12, 88, 10,};
        Arrays.sort(y);
        MethodPassingArrays_257.displayArray(y);//Creat method call reference use
        
        System.out.println("====================");
        for (int i : y) {
            System.out.print(i + " ");
            
        }
        System.out.println();
    }
}
