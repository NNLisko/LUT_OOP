package main;

public class Course {
    private String courseName;
    private int maxStudents;

    public Course(String courseName, int maxStudents) {
        this.courseName = courseName;
        this.maxStudents = maxStudents;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public int getMaxStudents() {
        return this.maxStudents;
    }
}
