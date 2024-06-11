package zad2.chain;

public class ABW extends JednostkaPolicji {

    public ABW(String nazwa) {
		super(nazwa);
	}

	@Override
    public boolean przyjmijMeldunek(String meldunek) {
        if(meldunek.toLowerCase().contains("terror")) {
        	System.out.println("ABW: Obsluga meldunku " + meldunek);
    		return true;
    	}
    	return przekazMeldunek(meldunek);
    }
}
