package adapter.zad_3;

import java.util.ArrayList;
import java.util.List;

public class FlightRegistry {
    private IFlightStrategy strategy;


    public List<Flight> getAllFlights () {
        List<Flight> flightList = new ArrayList<>();

        setStrategy(new FlightProvider_1());
        List<Flight> flights1 = strategy.getFlightList();

        for (Flight flight : flights1) {
            flightList.add(flight);
        }

        return flightList;
    }

    public void setStrategy(IFlightStrategy strategy) {
        this.strategy = strategy;
    }
}
