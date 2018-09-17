/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BeSkilled;

/**
 *
 * @author User
 */
public class CopyArray_257 {

    public static void main(String[] args) {
        int sourceArray[] = {2, 3, 4, 5, 10};
        int targerArray[] = new int[sourceArray.length];
        
        for (int i = 0; i < sourceArray.length; i++) {
            targerArray[i] = sourceArray[i];

        }
        for (int j : targerArray) {
            System.out.print(j + " ");

        }
        System.out.println("======================");
        //new array 
        int newArray[]=new int[sourceArray.length];
        System.arraycopy(sourceArray, 0, newArray, 0, sourceArray.length);
        //System.arraycopy(sourceArray, 1, newArray, 3, 2);
        for (int k:newArray) {
            System.out.print(k+ "  ");
            
        }
        
    }
}
