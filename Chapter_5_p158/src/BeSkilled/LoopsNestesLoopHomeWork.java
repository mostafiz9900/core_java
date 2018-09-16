package BeSkilled;

import java.util.Scanner;

public class LoopsNestesLoopHomeWork {

    public static void main(String[] args) {
        System.out.println("Pattern A");
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();

        }
        System.out.println("Pattern B");
        for (int i = 6; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");

            }
            System.out.println();
        }

        System.out.println("Pattern C");
        for (int i = 1; i <= 6; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.println(" ");
                for (int k = i; k >= 1; k--) {
                    System.out.print(k + " ");

                }

            }
            System.out.println();
        }
        System.out.println("======================");
        int s = 4;
        int l = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= s; j++) {
                System.out.print(" ");
                for (int k = 1; k <= l; k++) {
                    System.out.print("*");

                }
                //System.out.println();
                s--;
                l += s;
            }

        }
        System.out.println("=================================");
        for (int i = 1; i <= 4; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                    for (int m = 2; m <= i; m++) {
                        System.out.print("*");

                    }
                   System.out.println();
                }

            }

        }
        Scanner input =new Scanner(System.in);
        System.out.println("Enter a number  ");
        int num=input.nextInt();
        
        for (int i = 1; i < num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print(" ");
                for (int k = 1; k < (i*2); k++) {
                    System.out.print("*");
                   
                    
                }
               
            }
           System.out.println();  
        }
   
    }
}
