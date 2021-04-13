package Lab_07;

import java.util.HashMap;

public class HashMapExercise {
    
    public static void main(String[] args) {      
    // Create a HashMap object
    HashMap<Integer, String> students = new HashMap<Integer, String>();

    // Add information of 6 students
    students.put(001, "Tom");
    students.put(002, "Ted");
    students.put(003, "Bob");
    students.put(004, "Vic");
    students.put(005, "Dan");
    students.put(006, "Ted");

    // Display all elements pair of keys and values in the HashMap
    System.out.println(students);

    // Search the HashMap if the student ID 004 is in it
    // If yes, print out the name of this student
    if(students.containsKey(004))
        System.out.println(students.get(004));


    // Search the HashMap if the student name "Ted" is in it
    if(students.containsValue("Ted"))
        System.out.println("Ted is here");

    // Remove the element with key 003 from the HashMap
    students.remove(003);

    // Display a collection of the values in the HashMap
    System.out.println(students.values());
    }
}
