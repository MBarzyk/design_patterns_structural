package decorator.zad4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carriage {
    private CarriageType carriageType;
    private double mass;
}
