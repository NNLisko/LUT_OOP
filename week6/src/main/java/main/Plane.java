package main;

public class Plane extends Vehicle {
    public Plane(String manufacturer, String model, int maxSpeed) {
        super("Plane", manufacturer, model, maxSpeed);
    }

    public String drive() {
        return (this.manufacturer + this.model + " is flying in the sky!");
    }
}
