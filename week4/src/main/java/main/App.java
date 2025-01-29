package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner scanner;
    static ArrayList<Student> listOfStudents;

    public static void main(String[] args) {

        listOfStudents = new ArrayList<>();
        scanner = new Scanner(System.in);

        while (true) {
            System.out.println(
                    "1) Add student, 2) List students, 3) Add course completion for student, 4)\nList course completions, 5) Calculate the average of course\ncompletions, 6) Calculate median course completions, 7) Save students to\nfile, 8) Load students from a file, 0) End the program");

            int choice = -1;

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Wrong input donkey!");
            }

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
                    break;

                case 3:
                    Student.listStudents();
                    System.out.println("Which student?");
                    /* updates the selected student tracker variable */
                    Student.selectedStudent = Integer.parseInt(App.scanner.nextLine());

                    System.out.println("What is the name of the course?");
                    String courseName = scanner.nextLine();
                    System.out.println("What is the grade of the course?");
                    int grade = Integer.parseInt(scanner.nextLine());

                    Student.addGrade(courseName, grade);
                    break;

                case 4:
                    Student.listStudents();
                    System.out.println("Which student?");
                    /*
                     * NOTE TO SELF:
                     * Updates the selected student, for now i think both
                     * methods can be handled with same tracker
                     */
                    Student.selectedStudent = Integer.parseInt(App.scanner.nextLine());
                    Student.getGrades();
                    break;

                case 5:
                    Student.listStudents();
                    System.out.println("Which student?");
                    Student.selectedStudent = Integer.parseInt(scanner.nextLine());
                    Calculator.getAverageGrade(listOfStudents.get(Student.selectedStudent));
                    break;

                case 6:
                    Student.listStudents();
                    System.out.println("Which student?");
                    Student.selectedStudent = Integer.parseInt(App.scanner.nextLine());
                    Calculator.getMedianGrade(listOfStudents.get(Student.selectedStudent));
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

                case -1:
                    break;
                default:
                    System.out.println("Out of range");
                    break;
            }
        }
    }
}
