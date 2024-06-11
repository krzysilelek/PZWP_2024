package zad2.base;

public class KomendaGlowna extends JednostkaPolicji {

    @Override
    public void przyjmijMeldunek(String meldunek) {
        System.out.println("KG: Obsluguje meldunek " + meldunek);
    }
}
