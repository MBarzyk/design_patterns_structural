package adapter.zad_3;

public class Main {
    public static void main(String[] args) {

        FlightRegistry registry = new FlightRegistry();

        registry.getAllFlights().forEach(System.out::println);

    }
}
