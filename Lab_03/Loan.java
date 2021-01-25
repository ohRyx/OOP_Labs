package Lab_03;

import java.util.Date;

public class Loan {
    
    public double annualInterestRate;
    public int numberOfYears;
    public double loanAmount;
    public Date loanDate;

    public Loan(){

    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInterestRate; //this.annualInterestRate refer to public double annualInterestRate
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();

    }

    public double getMonthlyPayment(){
        double monthlyPayment;

        double monthlyInterestRate = annualInterestRate / 12;

        monthlyPayment = (loanAmount * monthlyInterestRate)/(1-
        1/
        Math.pow(1 + monthlyInterestRate, numberOfYears *  12));

        return monthlyPayment;
    }

    public double getTotalPayment(){
        return getMonthlyPayment() * numberOfYears * 12;
    }
}
