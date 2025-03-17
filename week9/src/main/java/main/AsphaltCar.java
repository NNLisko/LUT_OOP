package main;

public class AsphaltCar extends RallyCar {

    private double downForce;

    public AsphaltCar(String make, String model, int hp, double downForce) {
        super(make, model, hp);
        this.downForce = downForce;
    }

    public int calculatePerformance() {
        return 69;
    }

    public double getDownForce() {
        return this.downForce;
    }
}
