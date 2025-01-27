package main;

import java.util.HashMap;

class Student {

    String name;
    String studentID;
    HashMap<String, String> completedCourses;

    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
        this.completedCourses = new HashMap<String, String>();
    }

    public static void listStudents() {
        int index = 0;
        for (Student student : App.listOfStudents) {
            System.out.println(index + ": " + student.studentID + ": " + student.name + "\n");
        index++;
        }
    }

    public static void addGrade(String course, int grade) {
        listStudents();
        System.out.println("What is the name of the course?");
        String courseName = App.scanner.nextLine();
        System.out.println("What is the grade of the course?");
        int courseGrade = Integer.parseInt(App.scanner.nextLine());


    }

    public static void getGrades() {

    }
}