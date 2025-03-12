package main;

public class Driver {
    String name;
    String country;
    int totalPoints;

    public Driver(String name, String country) {
        this.name = name;
        this.country = country;
        this.totalPoints = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void addPoints(int points) {
        this.totalPoints += points;
    }
}
