package main;

public class Car extends Vehicle {

    public Car(String manufacturer, String model, int maxSpeed) {
        super("Car", manufacturer, model, maxSpeed);
    }

    public String drive() {
        return (this.manufacturer + this.model + " is driving on the road!");
    }
}
