package decorator.zad4;

import java.util.List;

public interface ITrain {
    public int getSpeed();
    public double getAccelaration();
    public List<Carriage> getCarriages();
    public double getTotalMass();
}
