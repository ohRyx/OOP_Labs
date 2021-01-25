package Lab_03;

import java.util.Scanner;

public class PaymentCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter annual interest rate (%) ");
        double annualInterestRate = input.nextDouble() / 100;

        System.out.println("Enter number of years: ");
        int numberOfYears = input.nextInt();

        System.out.println("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.println("The loan was created on " + loan.loanDate);
        System.out.println("The monthly payment is " + loan.getMonthlyPayment());
        System.out.println("The total payment is " + loan.getTotalPayment());

        input.close();

    }
}
