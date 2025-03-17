package main;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChampionshipStatistics {
    public static double driverAveragerPointsPerDriver(List<Driver> drivers) {
        return ChampionshipManager.getTotalChampionshipPoints() / ChampionshipManager.totalDrivers;
    }

    public static String findMostSuccessfulCountry(List<Driver> drivers) {
        if (drivers == null || drivers.isEmpty()) {
            return null; // Return null if the list is empty
        }

        Map<String, Integer> countryPoints = new HashMap<>();

        for (Driver driver : drivers) {
            String country = driver.getCountry();
            int wins = driver.totalPoints;

            countryPoints.put(country, countryPoints.getOrDefault(country, 0) + wins);
        }

        return Collections.max(countryPoints.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public static int countTotalRacesHeld() {
        return ChampionshipManager.totalRaces;
    }
}
