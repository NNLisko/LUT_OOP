package main;

public class Student {
    private String name;
    private String studentId;

    public Student (String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return this.name;
    }

    public String getStudentId() {
        return this.studentId;
    }
}
