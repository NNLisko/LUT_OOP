package main;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class RallyRaceResult implements RaceResult {

    String raceName;
    String location;
    Map<Driver, Integer> results;

    public RallyRaceResult(String racename, String location) {
        this.raceName = racename;
        this.location = location;
        results = new HashMap<>();
    }

    public String getRaceName() {
        return this.raceName;
    }

    public String getRaceLocation() {
        return this.location;
    }

    @Override
    public int getDriverPoints(Driver driver) {
        return driver.totalPoints;
    }

    @Override
    public void recordResult(Driver driver, int position, int points) {
        results.put(driver, position);
        driver.addPoints(points);
    }

    @Override
    public List<Driver> getResults() {
        List<Driver> standings = App.championshipMgr.getDriverStandings();
        return standings;
    }
}
