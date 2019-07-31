package adapter.zad_3;

import java.util.List;

public interface IFlightStrategy {
    void initAndLoad();
    Flight parse(String line);
    List<Flight> getFlightList();
}
