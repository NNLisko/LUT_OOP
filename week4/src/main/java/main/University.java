package main;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;

public class University {

    /* Learned about file writing from chatGPT and few stackoverflow pages */
    public static void saveStudentsToFile() {
        String filename = "students.ser";
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(App.listOfStudents);
            System.out.println("Students saved to file.");
        } catch (Exception e) {
            System.out.println("Failed to save");
        }
    }

    @SuppressWarnings("unchecked")
    public static void loadStudentsFromFile() {
        String filename = "students.ser";
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))){
            App.listOfStudents = (ArrayList<Student>) in.readObject();
            System.out.println("Students loaded from file.");
        } catch (Exception e) {
            System.out.println("Load failed");
        }
    }
}