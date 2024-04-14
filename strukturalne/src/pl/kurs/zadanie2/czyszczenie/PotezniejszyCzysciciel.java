package pl.kurs.zadanie2.czyszczenie;

public class PotezniejszyCzysciciel extends BazowyCzysciciel{

	public PotezniejszyCzysciciel(ICzyszczenie czyszczenie) {
		super(czyszczenie);
	}
	
	public void czyszczenie(String tekst) {
		super.czyszczenie(tekst);
		System.out.println("Jeszcze bardziej czyszcze");
	}

}
