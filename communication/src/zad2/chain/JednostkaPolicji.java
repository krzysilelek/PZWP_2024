package zad2.chain;

public abstract class JednostkaPolicji {

	private String nazwa;
	private JednostkaPolicji kolejnaJednostka;
	
	public JednostkaPolicji(String nazwa) {
		this.nazwa = nazwa;
		kolejnaJednostka = null;
	}
	
	public void setKolejnaJednostka(JednostkaPolicji kolejnaJednostka) {
		this.kolejnaJednostka = kolejnaJednostka;
	}
	
    public abstract boolean przyjmijMeldunek(String meldunek);
    
    public boolean przekazMeldunek(String meldunek) {
		if(kolejnaJednostka != null) {
			System.out.println(nazwa + ": Przekazanie meldunku " + meldunek);
			return kolejnaJednostka.przyjmijMeldunek(meldunek);
		}
		return false;
	}
}