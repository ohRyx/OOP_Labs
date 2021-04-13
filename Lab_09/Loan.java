package Lab_09;

public class Loan {
    private double loanAmount;
    private double annualInterestRate;
    private int numberOfYears;

    public Loan() {
    }

public double getLoanAmount() {
    return loanAmount;
    }
public void setLoanAmount(double loanAmount) {
    if (loanAmount <= 0)
    throw new IllegalArgumentException("Invalid loan amount");
    this.loanAmount = loanAmount;
    }
public double getAnnualInterestRate() {
    return annualInterestRate;
    }
public void setAnnualInterestRate(double annualInterestRate) {
    if (annualInterestRate < 0)
    throw new IllegalArgumentException("Invalid interest rate");
    this.annualInterestRate = annualInterestRate;
    }
public int getNumberOfYears() {
    return numberOfYears;
    }

public void setNumberOfYears(int numberOfYears) {
        if (numberOfYears <= 0 || numberOfYears > 100)
            throw new IllegalArgumentException("Invalid loan tenure");
        this.numberOfYears = numberOfYears;
        }
        double getMonthlyInterestRate() {
            return annualInterestRate / 12;
        }
        double getMonthlyPayment() {
            return loanAmount * getMonthlyInterestRate()
        / (1 - (1 / Math.pow(1 + getMonthlyInterestRate(),
        numberOfYears * 12)));
        }
        double getTotalPayment() {
            return getMonthlyPayment() * numberOfYears * 12;
        }    
}
