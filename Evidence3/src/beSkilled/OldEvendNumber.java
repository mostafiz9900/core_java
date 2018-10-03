
package beSkilled;

import java.util.Scanner;


public class OldEvendNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=input.nextInt();
        if (num==0) {
            System.out.println("is zero");
            
        }else{
            if (num%2==0) {
                System.out.println("old");
                
                
            }else{
                System.out.println("evend");
            }
        }
    }
}
