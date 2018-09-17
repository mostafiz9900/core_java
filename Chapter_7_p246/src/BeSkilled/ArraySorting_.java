/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeSkilled;

import java.util.Arrays;

/**
 *
 * @author User
 */
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
