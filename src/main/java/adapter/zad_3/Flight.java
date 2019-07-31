package adapter.zad_3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight {
    private String flightNumber;
    private Timestamp departure;
    private Timestamp arrival;
    List<Integer> premiumSeats;
    List<Integer> economySeats;
    Map<String, String> passengers;
}
