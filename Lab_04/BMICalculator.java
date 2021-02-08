package Lab_04;

import java.lang.Math;

public class BMICalculator {
    public static double calculateBmi(Person person)
    {
        return person.getWeight() / Math.pow(person.getHeight() / 100, 2);
    }

    public static String interpret(double bmi){
        if(bmi < 18.5)
            return "Underweight";
        else if(bmi < 25.0)
            return "Normal";
        else if (bmi < 30.0)
            return "Overweight";
        else
            return "Obese";

    }
    
}
