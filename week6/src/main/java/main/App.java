package main;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1) Create a new vehicle, 2) List vehicles, 3) Drive cars, 4) Fly planes, 5) Sail the Ships, 0) End the program");
            Integer choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    
                    break;
            
                case 0:
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
