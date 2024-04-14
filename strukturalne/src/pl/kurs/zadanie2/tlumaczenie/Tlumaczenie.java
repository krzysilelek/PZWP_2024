package pl.kurs.zadanie2.tlumaczenie;

public class Tlumaczenie {
	private ITlumaczenie tlumaczenie;
	
	public Tlumaczenie(ITlumaczenie tlumaczenie) {
		this.tlumaczenie = tlumaczenie;
	}
	
	public String przetlumacz(String tekst) {
		return tlumaczenie.przetlumacz(tekst);
	}
}
