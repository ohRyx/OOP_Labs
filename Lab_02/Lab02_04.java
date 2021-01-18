package Lab_02;

import java.util.Scanner;

public class Lab02_04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		float sum = 0;
		float average = 0;
		String choice = "N";
		
		
		do {
			
			num ++; // num = num + 1;
			System.out.println("Enter a number #" + num + ":");
			float val = input.nextFloat();
			
			System.out.println("Do you want to enter more numbers (Y/N): ");
			choice = input.next();
			
			sum += val;
			
			
		} while ("Y".equals(choice)); //choice.equals("Y")
		
		average = sum/num;
		System.out.println("The average is: " + average);
		
		input.close();

	}

}
