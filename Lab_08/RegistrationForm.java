package Lab_08;

import java.util.Scanner;

public class RegistrationForm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Create an object from User class
        User user = new User();

        //Handle object inputs
        try
        {
            System.out.println("--- Registration ---");
            System.out.println("First Name: ");
            user.setFirstName(in.nextLine());

            System.out.println("Last Name: ");
            user.setLastName(in.nextLine());

            System.out.println("Email: ");
            user.setEmail(in.nextLine());

            System.out.println("Password: ");
            user.setPassword(in.nextLine());

            System.out.println("Income: ");
            user.setIncome(in.nextDouble());
        } 
        catch(UserDataException exception)
        {
            System.out.println(exception.getMessage());
        }

        //Print out information and income tax
        System.out.println("Hi" + user.getFirstName() + " " + user.getLastName() + "<" + user.getEmail() + ">");
        System.out.println("Password: ****");
        System.out.println("Income: " + user.getIncome());

        try
        {
            System.out.println("Income Tax: " + TaxCalculator.calculate(user.getIncome()));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        in.close();
    }
    
}
