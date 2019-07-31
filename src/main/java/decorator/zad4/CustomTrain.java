package decorator.zad4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomTrain implements ITrain {
    private final ITrain train;

    private List<Carriage> additionalCarriageList = new ArrayList<>();
    private double additionalMass;

    public CustomTrain(ITrain train, double additionalMass, Carriage... carriages) {
        this.train = train;
        this.additionalCarriageList.addAll(Arrays.asList(carriages));
        this.additionalMass = additionalMass;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public double getAccelaration() {
        return 0;
    }

    @Override
    public List<Carriage> getCarriages() {
        return null;
    }

    @Override
    public double getTotalMass() {
        return 0;
    }
}
