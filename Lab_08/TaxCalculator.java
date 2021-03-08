package Lab_08;

import java.util.Scanner;

public class TaxCalculator {
public static double calculate(double income) throws Exception
{
     // handle negative income
    if(income < 0)
    {
        throw new IllegalArgumentException("The income is a negative number");
    }

    // handle too large
    if(income > 2e11) //200,000,000,000
    {
        throw new Exception("The income is too big");
    }

    // handle different brackets of income tax
    if (income >= 0 && income <= 18200)
    {
        return 0.0;
    }
    else if(income <= 45000)
    {
        return (income - 18200) * 0.19;
    }
    else if(income <= 120000)
    {
        return (income - 45001) * 0.325;
    }
    else if (income <= 180000)
    {
        return 29467 + (income - 120001) * 0.37;
    }
    else
    {
        return 51667 + (income - 18001) * 0.45;
    }
    
}

public static void main(String[] args) 
{   
    Scanner in = new Scanner(System.in);
    // taxable income from keyboard
    System.out.println("Enter Income: ");
    double income = in.nextDouble();
    // Calculate income tax with exeption handling
    try
    {
        System.out.println("Income Tax: " + calculate(income));
 
    } catch(Exception e)
    {
        System.out.println("Exception:                                                                                   " + e.getMessage());
    }
    
    in.close();

}
    
}
