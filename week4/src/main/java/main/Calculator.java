package main;

import java.util.ArrayList;
import java.util.HashMap;

public class Calculator {

    public static void getAverageGrade(Student s) {
        HashMap<String, Integer> courses = s.completedCourses;
        ArrayList<Integer> grades = new ArrayList<>(courses.values());

        int add = 0;
        for (int num : grades) {
            add += num;
        }

        float average = add / grades.size();

        System.out.println("Average is: " + average);
    }

    public static void getMedianGrade(Student s) {

    }

}