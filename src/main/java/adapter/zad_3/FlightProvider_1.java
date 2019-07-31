package adapter.zad_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.*;

public class FlightProvider_1 implements IFlightStrategy {
    private final static String PATH = "data/LOTY1.txt";

    private List<Flight> flights;

    public FlightProvider_1() {
        flights = new ArrayList<>();
    }

    @Override
    public void initAndLoad() {
        try (BufferedReader reader = new BufferedReader(new FileReader(PATH))){
            String line = null;
            while((line = reader.readLine()) != null){
                flights.add(parse(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Flight parse(String line) {
        String[] splits = line.replaceAll("\n", "").split(";");
        String flightNumber = splits[0];
        Timestamp departure = new Timestamp(Long.parseLong(splits[1]));
        Timestamp arrival = new Timestamp(Long.parseLong(splits[2]));

        List<Integer> premiumSeats = new ArrayList<>();
        String[] pSeats = splits[3].split("%");
        for (String pSeat : pSeats) {
            premiumSeats.add(Integer.parseInt(pSeat));
        }

        List<Integer> economySeats = new ArrayList<>();
        String[] eSeats = splits[4].split("%");
        for (String eSeat : eSeats) {
            economySeats.add(Integer.parseInt(eSeat));
        }

        Map<String, String> passengersAndNoOfReservation = new HashMap<>();
        String[] data = splits[5].split("%");
        List<String> dataSplit = new ArrayList<>();
        for (String datum : data) {
            dataSplit.addAll(Arrays.asList(datum.split("#")));
        }

        for (int i = 0; i < dataSplit.size(); i+=3) {

            passengersAndNoOfReservation.put(dataSplit.get(i) + "_" + dataSplit.get(i+1), dataSplit.get(i+2));
        }
        return new Flight(flightNumber, departure, arrival, premiumSeats, economySeats, passengersAndNoOfReservation);
    }

    @Override
    public List<Flight> getFlightList () {
        initAndLoad();
        return flights;
    }
}
