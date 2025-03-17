package main;

public class GravelCar extends RallyCar {

    private double suspensionTravel;

    public GravelCar(String make, String model, int hp, double suspensionTravel) {
        super(make, model, hp);
        this.suspensionTravel = suspensionTravel;
    }

    public int calculatePerformance() {
        return 69;
    }

    public double getSuspensionTravel() {
        return this.suspensionTravel;
    }
}
