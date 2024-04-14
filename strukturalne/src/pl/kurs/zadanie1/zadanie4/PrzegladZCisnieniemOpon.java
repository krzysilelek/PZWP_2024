package pl.kurs.zadanie1.zadanie4;

public class PrzegladZCisnieniemOpon extends Dekorator{
	
	private void sprawdzCisnienieOpon(Samochod s) {
		System.out.println("Sprawdzam ciśnienie opon w "+s);
	}
	
	@Override
	public void wykonajPrzeglad(Samochod s) {
		super.wykonajPrzeglad(s);
		sprawdzCisnienieOpon(s);		
		System.out.println("Przegląd samochodu "+s+" zakończony");
	}
}
