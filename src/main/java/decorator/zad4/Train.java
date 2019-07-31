package decorator.zad4;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public final class Train implements ITrain{
    private int speed;
    private double accelaration;
    private List<Carriage> carriages;
    private double totalMass;

    public Train(int speed, double accelaration, List<Carriage> carriages, double totalMass) {
        this.speed = 150;
        this.accelaration = 8;
        this.carriages = new ArrayList<>();
        this.totalMass = 20;
    }
}
