
package ComputeArea;

import java.util.Scanner;


public class FahrenheitToCelsius_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
       double celsius =(5.0/9)* (fahrenheit -32);
        System.out.println("Fahrenheit" + fahrenheit + " is " + celsius + " in celsius");
    }
 
}
