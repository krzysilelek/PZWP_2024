package zad2.chain;

public class Dzielnicowy extends JednostkaPolicji {

    public Dzielnicowy(String nazwa) {
		super(nazwa);
	}

	@Override
    public boolean przyjmijMeldunek(String meldunek) {
    	if(meldunek.toLowerCase().contains("rozbój") || meldunek.toLowerCase().contains("rozboju")) {
    		System.out.println("Dzielnicowy: Obsluga meldunku " + meldunek);
    		return true;
    	}
    	return przekazMeldunek(meldunek);
    }
	
}