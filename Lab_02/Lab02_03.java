package Lab_02;

import java.util.Scanner;

public class Lab02_03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a year: ");
		int year = input.nextInt();
		
		String animal = "Unknown";
		
		switch (year % 12) {
		 	case 0:
		 		animal ="Monkey";
		 		break;
		 		
		 	case 1:
		 		animal = "Rooster";
		 		break;
		 		
		 	case 2:
		 		animal = "Dog";
		 		break;
		 		
		 	case 3:
		 		animal = "Pig";
		 		break;
		 		
		 	case 4:
		 		animal = "Rat";
		 		break;
		 		
		 	case 5:
		 		animal = "Ox";
		 		break;
		 		
		 	case 6:
		 		animal = "Tiger";
		 		break;
		 		
		 	case 7:
		 		animal = "Rabbit";
		 		break;
		 		
		 	case 8:
		 		animal = "Dragon";
		 		break;
		 		
		 	case 9:
		 		animal = "Snake";
		 		break;
		 		
		 	case 10:
		 		animal = "Horse";
		 		break;
		 		
		 	case 11:
		 		animal = "Sheep";
		 		break;
		}
		
        System.out.println(animal);
        
        input.close();

		

	}

}
