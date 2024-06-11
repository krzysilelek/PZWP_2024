package zad2.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class Test {

    public static void main(String[] args) {
        new Test();
    }
    Collection<JednostkaPolicji> jednostki;

    public Test() {
        jednostki = new ArrayList<>();
        jednostki.add(new Dzielnicowy());
        jednostki.add(new Posterunek());
        jednostki.add(new KomendaGlowna());
        jednostki.add(new ABW());

        obsluzMeldunek("Proba kradziezy");
        obsluzMeldunek("Alarm terrorystyczny");
        obsluzMeldunek("Zgloszenie rozboju");
    }

    public void obsluzMeldunek(String meldunek) {
        System.out.println("Szukam adresata meldunku " + meldunek);
        if (meldunek.contains("rozboj") || meldunek.contains("rozboju")) {
            Iterator<JednostkaPolicji> it = jednostki.iterator();
            while (it.hasNext()) {
                Object o = it.next();
                if (o instanceof Dzielnicowy) {
                    ((Dzielnicowy) o).przyjmijMeldunek(meldunek);
                    break;
                }
            }
        }
        if (meldunek.contains("terror")) {
            Iterator<JednostkaPolicji> it = jednostki.iterator();
            while (it.hasNext()) {
                Object o = it.next();
                if (o instanceof ABW) {
                    ((ABW) o).przyjmijMeldunek(meldunek);
                    break;
                }
            }
        }
    }
}