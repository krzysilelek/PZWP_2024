package zad2.chain;

public class Posterunek extends JednostkaPolicji {

    public Posterunek(String nazwa) {
		super(nazwa);
	}

	@Override
    public boolean przyjmijMeldunek(String meldunek) {
		if(meldunek.toLowerCase().contains("kradzież")) {
    		System.out.println("Posterunek: Obsluguje meldunek " + meldunek);
    		return true;
    	}
    	return przekazMeldunek(meldunek);
    }
}
