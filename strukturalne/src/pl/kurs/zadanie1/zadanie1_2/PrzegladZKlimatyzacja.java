package pl.kurs.zadanie1.zadanie1_2;

public class PrzegladZKlimatyzacja extends Przeglad {
	
	private void sprawdzKlimatyzacje(Samochod s) {
		System.out.println("Sprawdzam klimatyzację w "+s);
	}
	
	@Override
	public void wykonajPrzeglad(Samochod s) {
		super.wykonajPrzeglad(s);
		sprawdzKlimatyzacje(s);
	}
}
