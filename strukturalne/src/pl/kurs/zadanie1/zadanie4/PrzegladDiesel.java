package pl.kurs.zadanie1.zadanie4;

public class PrzegladDiesel extends Dekorator{
	
	@Override
	public void wykonajPrzeglad(Samochod s) {
		super.wykonajPrzeglad(s);
		System.out.println("Przegląd samochodu "+s+" zakończony");
	}	
}
