package main;

import java.util.ArrayList;
import java.util.*;
import java.util.HashMap;
import java.lang.Math;

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
        HashMap<String, Integer> courses = s.completedCourses;
        ArrayList<Integer> grades = new ArrayList<>(courses.values());
        Collections.sort(grades);
        System.out.println(grades);

        if (grades.size() % 2 == 0) {
            int lowerIndex = grades.size() / 2 - 1;
            int upperIndex = grades.size() / 2;
            float median = (grades.get(lowerIndex) + grades.get(upperIndex)) / 2;
            System.out.println("Median is " + grades.get(lowerIndex) + grades.get(upperIndex) + " / 2 = " +  median);
        } else {
            int index = (int)Math.floor(grades.size() / 2);
            int median = grades.get(index);
            System.out.println("Median is " + median);
        }
    }
    
}