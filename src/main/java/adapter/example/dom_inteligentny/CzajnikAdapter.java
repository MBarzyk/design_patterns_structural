package adapter.example.dom_inteligentny;

import com.javagda25.design_patterns.structural.adapter.example.IElementDomuInteligentnego;

public class CzajnikAdapter implements IElementDomuInteligentnego {
    private final Czajnik czajnik;

    public CzajnikAdapter(Czajnik czajnik) {
        this.czajnik = czajnik;
    }

    @Override
    public void turnDeviceOn() {
        this.czajnik.uruchomSie();
    }

    @Override
    public void turnDeviceOff() {
        this.czajnik.zamknijSie();
    }
}
