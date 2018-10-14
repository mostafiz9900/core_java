/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beSkilled;

/**
 *
 * @author User
 */
public class NewClass {

    public static void main(String[] args) {
        xx(5);
    }

    public static void xx(int n) {
        if (n > 0) {
            System.out.println(n + " ");
            xx(n - 1);

        }
    }
}
