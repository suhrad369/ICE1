package studentwed6;

import java.util.Scanner;

/**
 * This class does this and that
 * @author Mehrdad Iravani
 */

public class StudentWed6{
    
    public static void main(String[] args){
        
        Student[] students = new Student[2];  //This defines an array
        
        Scanner input = new Scanner(System.in);
        
        for (int i=0; i < students.length; i++){
            
            System.out.println("Enter Student's name:");
            String name;
            name = input.nextLine();
            
            Student student = new Student(name);
            
            students[i] = student;
        }
        
        System.out.println("Printing the students:");
        
        for(Student student: students){
            System.out.println(student.getName());
        }
    }
}