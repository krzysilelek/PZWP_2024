package pl.kurs.zadanie1.zadanie5;

public class Przeglad {

	private IPrzegladStrategia strategia;
	
	public void ustawStrategie(IPrzegladStrategia strategia) {
		this.strategia = strategia;
	}
	
	public void wykonajPrzeglad(Samochod s) {
		strategia.wykonajPrzeglad(s);
	}
}
