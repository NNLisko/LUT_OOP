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

    /* So Max Lattunen helped me with this solution to the addGrade function
     * Honestly in my opinion the index of the chosen student should be passed
     * to the function as an argument instead of having to add it as a static
     * variable
     */
    public static int selectedStudent = -1;

    public static void addGrade(String course, int grade) {

        System.out.println("What is the name of the course?");
        String courseName = App.scanner.nextLine();
        System.out.println("What is the grade of the course?");
        int courseGrade = Integer.parseInt(App.scanner.nextLine());


    }

    public static void getGrades() {

    }
}