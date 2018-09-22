/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be_skilled;

public class PalindomEx {

    public static void main(String[] args) {
       // System.out.println(isPlandom("mom"));
        String[] arra = {"mom", "sss", "mim", "eye"};
        System.out.println(countPalindom(arra));
    }

    public static boolean isPlandom(String s) {

        StringBuilder str = new StringBuilder(s);

        String newStr = String.valueOf(str.reverse());

        if (newStr.equals(s)) {
            return true;

        }
        return false;
    }

    public static int countPalindom(String[] s) {
        int counter = 0;
        for (int i = 0; i < s.length; i++) {
            if (isPlandom(s[i])) {
                counter++;
                
            }
        }
        return counter;
    }
}
