package main;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        ArrayList<Vehicle> listOfVehicles = new ArrayList<Vehicle>();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "1) Create a new vehicle, 2) List vehicles, 3) Drive cars, 4) Fly planes, 5) Sail the Ships, 0) End the program");
            Integer choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Which vehicle do you want to build? 1) car, 2) plane, 3) ship");
                    String type = scanner.nextLine();
                    System.out.println("Who is the manufacturer?");
                    String man = scanner.nextLine();
                    System.out.println("What is the model of the vehicle?");
                    String model = scanner.nextLine();
                    System.out.println("What is the top speed?");
                    Integer speed = Integer.parseInt(scanner.nextLine());

                    switch (type) {
                        case "1":
                            listOfVehicles.add(new Car(man, model, speed));
                            break;
                        case "2":
                            listOfVehicles.add(new Plane(man, model, speed));
                            break;
                        case "3":
                            listOfVehicles.add(new Ship(man, model, speed));
                        default:
                            System.out.println("Wrong input.");
                            break;
                    }
                    break;

                case 2:
                    for (Vehicle vehicle : listOfVehicles) {
                        System.out.println(vehicle.type + ": " + vehicle.manufacturer + " " + vehicle.model);
                        System.out.println("Max speed: " + vehicle.maxSpeed + " km/h");
                        System.out.println("Engine: " + vehicle.engine.name + " (" + vehicle.engine.hp + "HP)\n");
                    }
                    break;

                case 3:
                    for (Vehicle vehicle : listOfVehicles) {
                        if (vehicle.type == "Car") {
                            vehicle.drive();
                        }
                    }
                    break;

                case 4:
                    for (Vehicle vehicle : listOfVehicles) {
                        if (vehicle.type == "Plane") {
                            vehicle.drive();
                        }
                    }
                    break;

                case 5:
                    for (Vehicle vehicle : listOfVehicles) {
                        if (vehicle.type == "Ship") {
                            vehicle.drive();
                        }
                    }

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
