package beSkilled;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        isFactor(input.nextInt());
    }
    
    static void isFactor(int num) {
        BigInteger f = BigInteger.valueOf(1);
        for (int i = 1; i <= num; i++) {
            f = f.multiply(BigInteger.valueOf(i));
            
        }
        System.out.println(f);
    }
    
}
