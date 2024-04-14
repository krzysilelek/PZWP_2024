package pl.kurs.zadanie1.zadanie4;

public class PrzegladZKlimatyzacja extends Dekorator {
	
	private void sprawdzKlimatyzacje(Samochod s) {
		System.out.println("Sprawdzam klimatyzację w "+s);
	}

	@Override
	public void wykonajPrzeglad(Samochod s) {
		super.wykonajPrzeglad(s);
		sprawdzKlimatyzacje(s);
		System.out.println("Przegląd samochodu "+s+" zakończony");
	}
}
