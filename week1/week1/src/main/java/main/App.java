package main;

import java.util.Scanner;

/* Most java is learned through geeksforgeeks website and w3schools website */

public class App {

    /*
     * This snippet of code below comes from chatGPT, or the idea of making
     * defaulthedgehog a field so all methods in App can access the instance
     */
    private Hedgehog defaulthedgehog;

    public void hedgehogProgram() {
        this.defaulthedgehog = new Hedgehog();
    }

    /*
     * Method to create the menu and handle the user choices and the logic of each
     * choice
     */

    public void menu() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1) Make the hedgehog talk, 2) Create a new hedgehog, 3) Make hedgehog run, 0) quit");
        System.out.println("");

        int Choice = Integer.parseInt(scanner.nextLine());

        while (Choice < 0 || Choice > 4) {
            System.out.println("Invalid Choice, Try again.");
            menu();
        }

        switch (Choice) {
            case 1:

                System.out.println("What does " + defaulthedgehog.name + " say?");
                String hoggySays = scanner.nextLine();

                System.out.println("My name is " + defaulthedgehog.name + "and my age is " + defaulthedgehog.age + ", "
                        + hoggySays);
                menu();
            case 2:

                System.out.println("What is the name of the Hedgehog?");
                String newname = scanner.nextLine();
                System.out.println("What is the age of the hedgehog?");

                /* The error handling here is partially from chatGPT */
                int age = -1;
                try {
                    age = Integer.parseInt(scanner.nextLine());
                    if (age < 0) {
                        System.out.println("Wrong input value");
                    }
                    ;
                } catch (NumberFormatException e) {
                    System.out.println("Wrong input value");
                }
                Hedgehog hedgehog = new Hedgehog(newname, age);
                menu();
            case 3:
                System.out.println("How many laps?");
                int laps = -1;
                try {
                    laps = Integer.parseInt(scanner.nextLine());
                    if (laps < 0) {
                        System.out.println("Wrong input value");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Wrong input value");
                }
                defaulthedgehog.run(laps);

            case 0:
                System.exit(0);

            default:
                System.out.println("Wrong input");

                scanner.close();
        }

    }

    public static void main(String[] args) {
        App program = new App();
        program.hedgehogProgram();
        program.menu();
    }

}
