package pl.kurs.zadanie2.czyszczenie;

public class Test {

	public static void main(String[] args) {
		BazowyCzysciciel b = new BazowyCzysciciel(new BazoweCzyszczenie());
		b.czyszczenie("");
		PotezniejszyCzysciciel bP = new PotezniejszyCzysciciel(new BazoweCzyszczenie());
		bP.czyszczenie("");
	}

}
