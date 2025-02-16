package main;

public class Ship extends Vehicle {

    public Ship(String manufacturer, String model, int maxSpeed) {
        super("Ship", manufacturer, model, maxSpeed);
    }

    public String drive() {
        return (this.manufacturer + this.model + " is sailing on the sea!");
    }
}
