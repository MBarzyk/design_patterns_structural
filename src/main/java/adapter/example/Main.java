package adapter.example;

import adapter.example.dom_inteligentny.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IElementDomuInteligentnego> dom = new ArrayList<>();
        dom.add(new CzajnikAdapter(new Czajnik()));
        dom.add(new LodowkaAdapter(new Lodowka()));
        dom.add(new SwiatloAdapter(new Swiatlo()));

        for (IElementDomuInteligentnego elementDomuInteligentnego : dom) {
            elementDomuInteligentnego.turnDeviceOn();
        }
    }
}
