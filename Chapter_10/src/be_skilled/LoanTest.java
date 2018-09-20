
package be_skilled;

import java.util.Scanner;


public class LoanTest {
    public static void main(String[] args) {
        Loan loan=new Loan(annualInterestRate, numberOfYests, loanAmount);
        Scanner input=new Scanner(System.in);
        System.out.println("Yearly interest rate");
        double annualInterestRate=input.nextDouble();
        
        System.out.println("Number of yest");
        int numberOfYests=input.nextInt();
         System.out.println("lian amount ");
         double loanAmount=input.nextDouble();
         
  
       
        System.out.println("The loan was created on %s\n"+"The monthly payment is %.2f\nThe total payment is %.2f\nThe total Interest is %.2f\n", loan.getLoanDate().toString(),loan.getMonthlyPayment());
       
    }
 
}
