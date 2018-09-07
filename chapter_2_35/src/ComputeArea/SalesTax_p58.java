
package ComputeArea;

import java.util.Scanner;


public class SalesTax_p58 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter purchages amount");
        double purchaseAmount = input.nextDouble();
        double tax =purchaseAmount * 0.06;
        System.out.println("Taxt amount " + (int)(tax * 100 )/ 100);
        
        //casting data type page 58
        float f= 12.5f;
        int i =(int)f;
        System.out.println("f  "+f);
        
        System.out.println("i  "+i);
    }
}
