package pl.kurs.zadanie2.czyszczenie;

public class BazowyCzysciciel {
	private ICzyszczenie czyszczenie;
	
	public BazowyCzysciciel(ICzyszczenie czyszczenie) {
		this.czyszczenie = czyszczenie;
	}
	
	public void czyszczenie(String tekst) {
		czyszczenie.wyczysc(tekst);
	}
}
