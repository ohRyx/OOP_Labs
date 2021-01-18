package Lab_02;

import java.util.Scanner;

public class Lab02_02 {

	public static final float PI = 3.14159f;
	
	public static void main(String[] args) {
		//final float PIE = 3.14159f; 
		
		System.out.println("Enter the radius");
		Scanner input = new Scanner(System.in);
		
		float radius = input.nextFloat();
		
		float area = radius * radius * PI;
		
		System.out.println("The Area for the circle of the Radius: " + radius + "is" + area);
		
		input.close();
		

	}

}