package main;
import java.util.ArrayList;
import java.util.Scanner;

public class App 
{
    static Scanner scanner;
    static ArrayList<Student> listOfStudents;

    public static void main( String[] args ) {
    
    listOfStudents = new ArrayList<>();
    scanner = new Scanner(System.in); 

        while (true) {
            System.out.println("1) Add student, 2) List students, 3) Add course completion for student, 4)\nList course completions, 5) Calculate the average of course\ncompletions, 6) Calculate median course completions, 7) Save students to\nfile, 8) Load students from a file, 0) End the program");
            int choice = Integer.parseInt(scanner.nextLine());
        
        switch (choice) {
            case 1:
                System.out.println("What is the name of the student?");
                String name = scanner.nextLine();
                System.out.println("What is the student number of the student?");
                String studentID = scanner.nextLine();

                Student student = new Student(name, studentID);
                listOfStudents.add(student);
                break;
        
            case 2:
                Student.listStudents();
                System.out.println("Which student?");
                int sIndex = Integer.parseInt(App.scanner.nextLine());
                break;
        
            case 3:
                break;
        
            case 4:
                break;
        
            case 5:
                break;
        
            case 6:
                break;
        
            case 7:
                break;
        
            case 8:
                break;
        
            case 0:
                System.out.println("Thank you for using the program.");
                scanner.close();
                System.exit(0);
                break;

            default:
                System.out.println("Wrong input donkey!");
                break;
        }
        
        }
    }
}
