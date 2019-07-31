package adapter.example.dom_inteligentny;

import adapter.example.IElementDomuInteligentnego;

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
