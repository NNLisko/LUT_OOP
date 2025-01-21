package main;
import java.util.Scanner;

public class App 
{
    
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1) make hedgehog talk, 2) create new hedgehog, 3) make hedgehog run, 0) quit");
        System.out.println("What's your choice?");
        int Choice = Integer.parseInt((scanner.nextLine()));
        System.out.println(choice);

        

        scanner.close();
        
    }
    public static void main( String[] args ) {
        menu();
    }
}

