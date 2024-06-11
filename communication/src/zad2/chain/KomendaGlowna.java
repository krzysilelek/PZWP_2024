package zad2.chain;

public class KomendaGlowna extends JednostkaPolicji {

    public KomendaGlowna(String nazwa) {
		super(nazwa);
	}

	@Override
    public boolean przyjmijMeldunek(String meldunek) {
    	if(meldunek.toLowerCase().contains("mafia") || meldunek.toLowerCase().contains("mafii")) {
    		System.out.println("KG: Obsluguje meldunek " + meldunek);
    		return true;
    	}
    	return przekazMeldunek(meldunek); 
    }
}
