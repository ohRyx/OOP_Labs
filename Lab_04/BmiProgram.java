package Lab_04;

import java.util.Scanner;

public class BmiProgram {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int choice = 0;
        Person person = new Person();

        do
        {
            System.out.println("\n---BMI Calculator---");
            System.out.println("1. Enter Information");
            System.out.println("2. Show Information");
            System.out.println("3. Calculate BMI");
            System.out.println("4. Exit");
            System.out.println("Select: ");
            choice = input.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("\nEnter Name: ");
                    String name = input.next();
                    System.out.println("Enter Age: ");
                    int age = input.nextInt();
                    System.out.println("Enter Height: ");
                    double height = input.nextDouble();
                    System.out.println("Enter Weight: ");
                    double weight = input.nextDouble();

                    person = new Person(name,age,height,weight);
                    break;
                
                case 2:
                    person.info();
                    break;

                case 3:
                    double bmi = BMICalculator.calculateBmi(person);
                    String interpretation = BMICalculator.interpret(bmi);
                    System.out.println("\nBMI: " + bmi + " - " + interpretation);
                    break;       
            }


        } while(choice > 0 && choice < 4);

        input.close();
    } 
}
