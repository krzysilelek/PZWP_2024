package pl.kurs.zadanie1.zadanie4;

public class PrzegladKlimatyzacjaZWymianaPlynuChlodzacego extends Dekorator{
	
	private void sprawdzWymianePlynuChlodzacego(Samochod s) {
		System.out.println("Sprawdzam ciśnienie opon w "+s);
	}
	
	private void sprawdzKlimatyzacje(Samochod s) {
		System.out.println("Sprawdzam klimatyzację w "+s);
	}
	
	@Override
	public void wykonajPrzeglad(Samochod s) {
		super.wykonajPrzeglad(s);
		sprawdzKlimatyzacje(s);
		sprawdzWymianePlynuChlodzacego(s);	
		System.out.println("Przegląd samochodu "+s+" zakończony");
	}
	
}
