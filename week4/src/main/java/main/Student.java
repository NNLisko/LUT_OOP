package main;

import java.util.ArrayList;
import java.io.Serializable;

public class Student implements Serializable{

    String name;
    String studentID;
    ArrayList<String> coursesCompleted;
    ArrayList<Integer> courseGrades;

    public Student(String name, String studentID) {
        this.name = name;
        this.studentID = studentID;
        this.coursesCompleted = new ArrayList<String>();
        this.courseGrades = new ArrayList<Integer>();
    }

    public static void listStudents() {
        int index = 0;
        for (Student student : App.listOfStudents) {
            System.out.println(index + ": " + student.studentID + ": " + student.name);
            index++;
        }
    }

    /*
     * So Max Lattunen helped me with this solution to the addGrade function,
     * where index of the student should be asked before course name and course
     * grade but still should not be passed as a parameter to addGrade();
     * 
     * Honestly in my opinion the index of the chosen student should be passed
     * to the function as an argument instead of having to add it as a static
     * variable
     */

    public static int selectedStudent = -1;

    public static void addGrade(String course, int grade) {
        /* gets the selected student */
        Student student = App.listOfStudents.get(selectedStudent);
        /* adds the coursename, grade key value pair */
        student.coursesCompleted.add(course);
        student.courseGrades.add(grade);
    }

    public static void getGrades() {
        ArrayList<String> courses = App.listOfStudents.get(selectedStudent).coursesCompleted;
        ArrayList<Integer> grade = App.listOfStudents.get(selectedStudent).courseGrades;

        for (String course : courses) {
            System.out.println(course + ": " + grade.get(courses.indexOf(course)));
        }
    }
}