package main;

public class App {

    public static ChampionshipManager championshipMgr;

    public static void main(String[] args) {
        championshipMgr = ChampionshipManager.getInstance();

        championshipMgr.registerDriver(
                new Driver("Sébastien Ogier", "France", new GravelCar("Toyota", "GR Yaris Rally1", 365, 100)));
        championshipMgr.registerDriver(
                new Driver("Kalle Rovanperä", "Finland", new GravelCar("Toyota", "GR Yaris Rally1", 500, 100)));
        championshipMgr.registerDriver(
                new Driver("Ott Tänak", "Estonia", new GravelCar("Hyundai", "i20N Rally1", 500, 100)));
        championshipMgr.registerDriver(
                new Driver("Thierry Neuville", "Belgium", new GravelCar("Hyundai", "i20N Rally1", 500, 100)));

        RallyRaceResult race = new RallyRaceResult("Arctic thunder rally", "Rovaniemi, Finland");
        RallyRaceResult race2 = new RallyRaceResult("Sahara Dunes Rally", "Merzouga, Morocco");

        race.recordResult(championshipMgr.getDriverStandings().get(0), 1, 40);
        race.recordResult(championshipMgr.getDriverStandings().get(1), 2, 35);
        race.recordResult(championshipMgr.getDriverStandings().get(2), 3, 30);
        race.recordResult(championshipMgr.getDriverStandings().get(3), 4, 25);

        race2.recordResult(championshipMgr.getDriverStandings().get(3), 1, 40);
        race2.recordResult(championshipMgr.getDriverStandings().get(2), 2, 35);
        race2.recordResult(championshipMgr.getDriverStandings().get(0), 3, 30);
        race2.recordResult(championshipMgr.getDriverStandings().get(1), 4, 25);

        ChampionshipManager.printDrivers();
        ChampionshipManager.printLeader();
        ChampionshipManager.printStatistics();

    }
}
