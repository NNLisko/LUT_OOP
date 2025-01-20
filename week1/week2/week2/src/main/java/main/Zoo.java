package main;
import java.util.ArrayList;
import java.util.Scanner;

/* ZOO CLASS */
public class Zoo {
    String name;
    ArrayList<Animal> listOfAnimals = new ArrayList<>();

    /*ZOO CONSTRUCTOR */
    public Zoo(String name) {
        this.name = name;
    }

    /* User can add animals after logging their species name and age */    
    public void addAnimals() {
        Scanner scanner = new Scanner(System.in);
        
        /* getting new animal info */
        System.out.println("What species?");
        String animalSpecies = scanner.nextLine();
        System.out.println("Enter the name of the animal:");
        String animalName = scanner.nextLine();
        System.out.println("Enter the age of the animal:");
        int animalAge = Integer.parseInt(scanner.nextLine());

        Animal newAnimal = new Animal(animalSpecies, animalName, animalAge);
        this.listOfAnimals.add(newAnimal);
        scanner.close();
    }
    
    /* User can print out the animals nicely formatted */
    public void listAnimals() {
        System.out.print(this.name + " contains the following animals:");
        for (Animal animal : listOfAnimals) {
            System.out.println(animal.species + ": " + animal.name + ", " + animal.age + " years");
        }
    }

    /* ANIMAL CLASS */
    public class Animal {
        private String species;
        private String name;
        private int age;

        /* ANIMAL CONSTRUCTOR */
        public Animal(String species, String name, int age){
            this.species = species;
            this.name = name;
            this.age = age;
        }
    }
}
