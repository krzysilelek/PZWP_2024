package pl.kurs.zadanie1.zadanie4;

public abstract class Dekorator implements IPrzeglad{
	
	private PrzegladBazowy przeglad = new PrzegladBazowy();
	
	@Override
	public void wykonajPrzeglad(Samochod s) {
		przeglad.wykonajPrzeglad(s);
	}
}
