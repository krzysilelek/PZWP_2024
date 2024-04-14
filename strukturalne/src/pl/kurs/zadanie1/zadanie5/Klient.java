package pl.kurs.zadanie1.zadanie5;
public class Klient {
	public static void main(String[] args) {
		
		Samochod s = new Samochod("Fiat Punto");
		Przeglad przeglad = new Przeglad();
		przeglad.ustawStrategie(new PrzegladStrategia());
		przeglad.wykonajPrzeglad(s);

		
		s = new Samochod("Ford Mondeo");
		przeglad.ustawStrategie(new DieselPrzegladStrategia());
		przeglad.wykonajPrzeglad(s);
		
		s = new Samochod("Opel Astra");
		przeglad.ustawStrategie(new PrzegladZKlimatyzacjaStrategia());
		przeglad.wykonajPrzeglad(s);
		
		s = new Samochod("BWM E36");
		przeglad.ustawStrategie(new PrzegladZCisnieniemOponStrategia());
		przeglad.wykonajPrzeglad(s);
		
		s = new Samochod("Hyundai i20");
		przeglad.ustawStrategie(new PrzegladKlimatyzacjaZWymianaPlynuChlodniczego());
		przeglad.wykonajPrzeglad(s);
		
	}
}
