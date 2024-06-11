package zad2.base;

public class Dzielnicowy extends JednostkaPolicji {

    @Override
    public void przyjmijMeldunek(String meldunek) {
        System.out.println("Dzielnicowy: Obsluga meldunku " + meldunek);
    }
//...
}