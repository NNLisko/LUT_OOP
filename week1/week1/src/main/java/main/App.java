package main;
import java.util.Scanner;



public class App {
    public static void main(String[] args) {
        Hedgehog hedgehogSonic = new Hedgehog();
    }

    /*Method to create the menu */

    public void menu() {
        System.out.println("1) Make the hedgehog talk, 2) Create a new hedgehog, 3) Make hedgehog run, 0) quit");
        Scanner x = new Scanner(System.in);
        System.out.println("");

        String y = x.nextLine();
        int Choice = Integer.valueOf(y);

        while (Choice < 0 || Choice > 4) {
            System.out.println("Invalid Choice, Try again.");
            menu();
        }

        if (Choice == 0) {
            System.out.println("Thank you for using this program.");
            System.exit(0);
        } else if (Choice == 1) {
            
        } else if (Choice == 2) {
            
        } else if (Choice == 3) {
            
        } else if (Choice == 4) {
            
        }
    }
}