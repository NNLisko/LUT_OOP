package main;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        /* Creating the zoo instance */

        System.out.println("Please, name the zoo:");
        String zooName = scanner.nextLine();
        Zoo zoo = new Zoo(zooName);
        
        /* While loop for the menu and choice handling */

        while (true) {
            System.out.println("1) Create a new animal, 2) List all animals, 3) Run animals, 0) End the program");
            int choice = Integer.parseInt(scanner.nextLine());
            
            if (choice > 3 || choice < 0) {
                System.out.println("Wrong input value");
                continue;
            }

            /* Choice handling */

            switch (choice) {
                case 1:                    
                    /* getting new animal info */
                    System.out.println("What species?");
                    String species = scanner.nextLine();
                    System.out.println("Enter the name of the animal:");
                    String name = scanner.nextLine();
                    System.out.println("Enter the age of the animal:");
                    int age = Integer.parseInt(scanner.nextLine());        
        
                    zoo.addAnimals(species, name, age);
                    break;
                case 2:  /* listing animals */
                    zoo.listAnimals();
                    break;
                case 3: /* running animals */
                    System.out.println("How many laps?");
                    int laps = Integer.parseInt(scanner.nextLine());

                    zoo.animalsRun(laps);
                    break;
                case 0:
                    scanner.close();
                    System.out.print("Thank you for using the program.");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}