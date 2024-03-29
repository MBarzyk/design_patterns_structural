package adapter.example.dom_inteligentny;

import adapter.example.IElementDomuInteligentnego;

public class LodowkaAdapter implements IElementDomuInteligentnego {
    private final Lodowka lodowka;

    public LodowkaAdapter(Lodowka lodowka) {
        this.lodowka = lodowka;
    }

    @Override
    public void turnDeviceOn() {
        this.lodowka.on();
    }

    @Override
    public void turnDeviceOff() {
        this.lodowka.off();
    }
}
