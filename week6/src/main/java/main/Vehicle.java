package main;

public abstract class Vehicle {
    String type;
    String manufacturer;
    String model;
    int maxSpeed;
    Engine engine;

    Vehicle(String type, String manufacturer, String model, int maxSpeed) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;

        switch (type) {
            case "Car":
                this.engine = new Engine("V8", 300);
                break;
            case "Plane":
                this.engine = new Engine("Jet engine", 500);
                break;
            case "Ship":
                this.engine = new Engine("Wärtsilä Super", 1000);
            default:
                break;
        }
    }

    public abstract String drive();

}
