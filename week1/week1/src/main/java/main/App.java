package main;
import java.util.Scanner;

/* Most java is learned through geeksforgeeks website and w3schools website */

public class App {
    
    public static void main(String[] args) {

        /* creates the default instance */
        
        Hedgehog currenthog = new Hedgehog("Pikseli", 5);

        /*
        * creating the menu and handle the user choices and the logic of each
        * choice
        */

        Scanner scanner = new Scanner(System.in);

        /* From chatGPT help to turn the menu into a while loop,
         * compared tos my earlier menu() method that I had.
         */

        while (true) {

        
            System.out.println("1) Make hedgehog talk, 2) Create new hedgehog, 3) Make hedgehog run, 0) Quit");

            int choice = -1;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Wrong input value");
            }

            if (choice < -1 || choice > 3 ) {
                System.out.println("Invalid Choice, Try again.");
            }

            switch (choice) {
                case 1:

                    System.out.println("What does hedgehog say?");
                    String hoggySays = scanner.nextLine();
                    if (hoggySays.isEmpty()) {
                        System.out.println("I am " + currenthog.name + " and my age is " + currenthog.age + ", but could you still give me input values?");
                    } else {
                        System.out.println(currenthog.name + ": " + hoggySays);
                    }
                    break;
                case 2:

                    System.out.println("What is the name of the hedgehog:");
                    String newname = scanner.nextLine();
                    System.out.println("What is the age of the hedgehog:");

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
                    currenthog.name = newname;
                    currenthog.age = age;
                    break;

                case 3:
                    System.out.println("How many laps?");
                    int laps = -1;
                    try {
                        laps = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Wrong input value");
                    }
                    currenthog.run(laps);
                    break;
                case -1:
                    System.out.println("Wrong input value");
                    break;
                case 0:
                    scanner.close();
                    System.out.println("Thank you for using the program.");
                    System.exit(0);
            }
        }
    }
}
