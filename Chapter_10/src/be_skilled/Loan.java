
package be_skilled;

import java.util.Date;


public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;
    
    //Default constructor

    public Loan() {
    }
    //Argumenstic constractor

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount, Date loanDate) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = loanDate;
    }
    //Return annualInterestT=Rate

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
//Set a new number of Years
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
//Return getNumberOfYears
    public int getNumberOfYears() {
        return numberOfYears;
    }
//Set a new setNumberOfYears
    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }
    
    
    public double getMonthlyPayment(){
    double monthlyInterestRate=annualInterestRate*1200;
    double monthlyPaymemt=loanAmount*monthlyInterestRate/(1-(1/Math.pow(1+monthlyInterestRate,numberOfYears*12)));
    return monthlyPaymemt;
    }
    //Find total payment
    public double getTotalPayment(){
    double totalPayment=getMonthlyPayment()*numberOfYears*12;
    return totalPayment;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }
}
