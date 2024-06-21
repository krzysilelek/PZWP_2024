package ex2.base;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        new Test();
    }
    List<JednostkaPolicji> jednostki;

    public Test() {
        jednostki = new ArrayList<JednostkaPolicji>();
        jednostki.add(new Dzielnicowy());
        jednostki.add(new Posterunek());
        jednostki.add(new KomendaGlowna());
        jednostki.add(new ABW());

        System.out.println("====Szefowie=====");
        wypiszSzefow();
        System.out.println("====Powierzchnie=====");
        wypiszPowierzchnie();

    }

    public void wypiszSzefow() {
        System.out.println("Szefowie jednostek:");
        for (JednostkaPolicji jednostka : jednostki) {
            if (jednostka instanceof Dzielnicowy) {
                System.out.println("Dzielnicowy: "
                        + ((Dzielnicowy) jednostka).nazwiskoDzielnicowego);
            }
            if (jednostka instanceof Posterunek) {
                System.out.println("Posterunek: "
                        + ((Posterunek) jednostka).nazwiskoKomendanta);
            }
            if (jednostka instanceof KomendaGlowna) {
                System.out.println("KG: "
                        + ((KomendaGlowna) jednostka).komendant);
            }
            if (jednostka instanceof ABW) {
                System.out.println("ABW: Nazwisko jest tajne!");
            }
        }
    }

    public void wypiszPowierzchnie() {
        for (JednostkaPolicji jednostka : jednostki) {
            if (jednostka instanceof Dzielnicowy) {
                System.out.println("Dzielnica: "
                        + ((Dzielnicowy) jednostka).powierzchnia);
            }
            if (jednostka instanceof Posterunek) {
                System.out.println("Posterunek: "
                        + (((Posterunek) jednostka).szerokosc
                        * ((Posterunek) jednostka).dlugosc));
            }
            if (jednostka instanceof KomendaGlowna) {
                System.out.println("KG: "
                        + ((KomendaGlowna) jednostka).obszar);
            }
            if (jednostka instanceof ABW) {
                System.out.println("ABW: Cala Polska");
            }
        }
    }
}