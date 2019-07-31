package adapter.example.dom_inteligentny;

import com.javagda25.design_patterns.structural.adapter.example.IElementDomuInteligentnego;

public class SwiatloAdapter implements IElementDomuInteligentnego {
    private final Swiatlo swiatlo;

    public SwiatloAdapter(Swiatlo swiatlo) {
        this.swiatlo = swiatlo;
    }

    @Override
    public void turnDeviceOn() {
        this.swiatlo.turnOn();
    }

    @Override
    public void turnDeviceOff() {
        this.swiatlo.turnOff();
    }
}
