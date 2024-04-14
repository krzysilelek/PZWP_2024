package pl.kurs.zadanie1.zadanie4;

public class Przeglad extends Dekorator{

	private void wymienSwiece(Samochod s) {
		System.out.println("Wymieniam świece w "+s);
	}

	@Override
	public void wykonajPrzeglad(Samochod s) {
		super.wykonajPrzeglad(s);
		wymienSwiece(s);
		System.out.println("Przegląd samochodu "+s+" zakończony");
	}
}
