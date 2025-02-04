package main;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

public class Calculator {

    public static void getAverageGrade(Student s) {
        ArrayList<Integer> grade = s.courseGrades;
    
        int sum = 0;
        for (int num : grade) {
            sum += num;
        }

        float avg = sum / grade.size();

        System.out.println("Average is " + avg);
    }

    public static void getMedianGrade(Student s) {
        ArrayList<Integer> grade = new ArrayList<>(s.courseGrades);
        Collections.sort(grade);

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat f = new DecimalFormat("#0.0", symbols);


        if (grade.size() % 2 == 0) {
            int lowIndex = grade.size() / 2 - 1;
            int highIndex = grade.size() / 2;
            float newMedian = (grade.get(lowIndex) + grade.get(highIndex)) / 2.0f;
            System.out.println("Median is " + f.format(newMedian));

        } else {
            int indx = grade.size() / 2;
            int newMedian = grade.get(indx);
            System.out.println("Median is " + f.format(newMedian));

        }
    }
}