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

    public static void addGrade(String course, String grade) {
        /* gets the selected student */
        Student student = App.listOfStudents.get(selectedStudent);
        /* adds the coursename, grade key value pair */
        student.completedCourses.put(course, grade);
    }

    public static void getGrades() {
        HashMap<String, String> grades = App.listOfStudents.get(selectedStudent).completedCourses;
        /*
         * lambda printing of hashmap at
         * https://stackoverflow.com/questions/5920135/printing-hashmap-in-java
         */
        grades.forEach((key, value) -> System.out.println(value + ": " + key));
    }
}