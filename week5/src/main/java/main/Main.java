package main;

import java.util.ArrayList;

public class Main 
{
    public static void main( String[] args )
    {
        ArrayList<Course> courseList = new ArrayList<Course>(); 
        Course course1 = new Course("Programming 101", 30);
        courseList.add(course1);

        ArrayList<Student> studentList = new ArrayList<Student>();
        Student student1 = new Student("John Smith", "S001");
        Student student2 = new Student("Alice Johnson", "S002");
        studentList.add(student1);
        studentList.add(student2);

        System.out.println("Course Information:");
        for (Course course : courseList) {
            System.out.println("Name: " + course.getCourseName());
            System.out.println("Maximum students: " + course.getMaxStudents());
        }
        System.out.println();
        int index = 1;
        System.out.println("Student Information:"); 
        for (Student student : studentList) {
            System.out.println("Student " + index + " - Name: " + student.getName() + ", ID: " + student.getStudentId());
            index++;
        }
    }
}
