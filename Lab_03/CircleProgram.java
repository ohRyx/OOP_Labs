package Lab_03;

import java.util.Scanner;


public class CircleProgram {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("The area for the circle radius: " + circle.getRadius() 
        + " is " + circle.getArea());

        input.close();
        
    }
}
