package Lab_07;

import java.util.Scanner;
import java.util.Stack;

public class StackExercise {

     public static void main(String[] args) {
        // Create a stack collection
        Stack collection = new Stack();
        // Add integers(100, 200, 300, 400) through keyboard
        Scanner in = new Scanner(System.in);
        String value;

        do
        {
            System.out.println("Enter value: ");
            value = in.nextLine();
            if(!"".equals(value))
                collection.add(Integer.valueOf(value));
        } while(!"".equals(value));

        // Check if the element 300 in the stack collection
        // If yes, remove the element
        if(collection.contains(300))
            collection.removeElement(300);

        //  Display the size of collection
        System.out.println(collection.size());

        // Create an integer stack
        Stack<Integer> integerStack = new Stack<>();

        // use Push to add integers
        integerStack.push(10);
        integerStack.push(11);
        integerStack.push(12);
        integerStack.push(13);
        integerStack.push(14);
        integerStack.push(15);

        // Remove 2 elements from stack
        integerStack.pop();
        integerStack.pop();

        // Display the element at the top of the stack
        System.out.println(integerStack.peek());

        // Add all elements of integer stack into the stack collection
        collection.addAll(integerStack);

        // Display all elements in  the stack collection
        System.out.println(collection);

        in.close();
    }
    
}
