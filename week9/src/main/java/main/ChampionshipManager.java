package main;

import java.util.ArrayList;
import java.util.List;

public class ChampionshipManager {
    private static ChampionshipManager instance = null;
    public static int totalDrivers;
    public static int totalRaces;
    private List<Driver> drivers;
    private List<RallyRaceResult> races;

    private ChampionshipManager() {
        totalDrivers = 0;
        totalRaces = 0;
        drivers = new ArrayList<>();
        races = new ArrayList<>();
    }

    public static ChampionshipManager getInstance() {
        if (instance == null) {
            instance = new ChampionshipManager();
        }
        return instance;
    }

    public void registerDriver(Driver driver) {
        totalDrivers += 1;
        drivers.add(driver);
    }

    public void addRaceResult(RallyRaceResult result) {
        totalRaces += 1;
        races.add(result);
    }

    public List<Driver> getDriverStandings() {
        List<Driver> sortedDrivers = new ArrayList<>(drivers);
        sortedDrivers.sort((d1, d2) -> Integer.compare(d2.getPoints(), d1.getPoints()));
        return sortedDrivers;
    }

    public static Driver getLeadingDriver() {
        Driver leader = App.championshipMgr.drivers.get(0);

        for (Driver driver : App.championshipMgr.drivers) {
            if (driver.totalPoints > leader.totalPoints) {
                leader = driver;
            }
        }
        return leader;
    }

    public static int getTotalChampionshipPoints() {
        int total = 0;

        for (Driver driver : App.championshipMgr.drivers) {
            total += driver.totalPoints;
        }

        return total;
    }

    /* PRINT METHODS IGNORE */

    public static void printDrivers() {
        List<Driver> drivers = App.championshipMgr.getDriverStandings();
        int index = 1;

        for (Driver driver : drivers) {
            System.out.println(index + ". " + driver.getName() + "(" + driver.getCountry() + "): " + driver.getPoints()
                    + " points");
            index++;
        }
        System.out.println();
    }

    public static void printLeader() {
        System.out.println("===== CHAMPIONSHIP LEADER =====");
        Driver leader = ChampionshipManager.getLeadingDriver();
        System.out.println(leader.getName() + " with "
                + leader.getPoints() + " points" + "\n");
    }

    public static void printStatistics() {
        System.out.println("===== CHAMPIONSHIP STATISTICS =====");

        System.out.println("Total Drivers: " + totalDrivers);
        System.out.println("Total Races: " + totalRaces);
        System.out.println("Averager points per driver: "
                + ChampionshipStatistics.driverAveragerPointsPerDriver(App.championshipMgr.drivers));

        System.out.println("Most successful country: "
                + ChampionshipStatistics.findMostSuccessfulCountry(App.championshipMgr.drivers));

        System.out.println("Total reces held: " + ChampionshipStatistics.countTotalRacesHeld());

    }
}
