package main;

public class Driver {
    String name;
    String country;
    int totalPoints;
    RallyCar car;

    public Driver(String name, String country, RallyCar car) {
        this.name = name;
        this.country = country;
        this.car = car;
        this.totalPoints = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getCountry() {
        return this.country;
    }

    public int getPoints() {
        return this.totalPoints;
    }

    public RallyCar getCar() {
        return this.car;
    }

    public void setCar(RallyCar car) {
        this.car = car;
    }

    public void addPoints(int points) {
        this.totalPoints += points;
    }
}
