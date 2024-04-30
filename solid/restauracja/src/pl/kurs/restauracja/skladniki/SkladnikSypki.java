package pl.kurs.restauracja.skladniki;

public abstract class SkladnikSypki extends Skladnik{
	
	public SkladnikSypki(String nazwa, int ilosc) {
		super(nazwa, ilosc);
	}

	public void gotuj() {
		System.out.println("Gotowanie makaronu");
	}
	
	@Override
	public void przygotuj() {
		gotuj();
	}
}
