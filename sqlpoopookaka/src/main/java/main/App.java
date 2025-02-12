package main;

public class App {
    public static void main( String[] args ) throws ClassNotFoundException
    {
        Class.forName("org.postgresql.Driver");
        DatabaseUtil.connection();
    }
}
