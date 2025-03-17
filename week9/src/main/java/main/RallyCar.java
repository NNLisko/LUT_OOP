package main;

public abstract class RallyCar {
    String make;
    String model;
    int hp;

    public RallyCar(String make, String model, int hp) {
        this.make = make;
        this.model = model;
        this.hp = hp;
    }

    public abstract int calculatePerformance();

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getHorsePower() {
        return this.hp;
    }
}
