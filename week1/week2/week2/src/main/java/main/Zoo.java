package main;
import java.util.ArrayList;

/* ZOO CLASS */
public class Zoo {
    String name;
    ArrayList<Animal> listOfAnimals = new ArrayList<>();

    /*ZOO CONSTRUCTOR */
    public Zoo(String name) {
        this.name = name;
    }

    /* User can add animals after logging their species name and age */    
    public void addAnimals(String animalSpecies, String animalName, int animalAge) {

        Animal newAnimal = new Animal(animalSpecies, animalName, animalAge);
        this.listOfAnimals.add(newAnimal);
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
