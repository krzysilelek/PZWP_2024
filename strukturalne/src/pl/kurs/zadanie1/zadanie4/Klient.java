package pl.kurs.zadanie1.zadanie4;

public class Klient {
	public static void main(String[] args) {
		Samochod s = new Samochod("Fiat Panda");
		IPrzeglad przeglad = new Przeglad();
		przeglad.wykonajPrzeglad(s);

		przeglad = new PrzegladDiesel(); 
		s = new Samochod("Ford Focus");
		przeglad.wykonajPrzeglad(s);
		
		przeglad = new PrzegladZKlimatyzacja();
		s = new Samochod("Opel Astra");
		przeglad.wykonajPrzeglad(s);
		
		przeglad = new PrzegladZCisnieniemOpon();
		s = new Samochod("BWM E36");
		przeglad.wykonajPrzeglad(s);
		
		przeglad = new PrzegladZCisnieniemOpon();
		s = new Samochod("BWM E36");
		przeglad.wykonajPrzeglad(s);
		
		przeglad = new PrzegladKlimatyzacjaZWymianaPlynuChlodzacego();
		s = new Samochod("Hyundai i20");
		przeglad.wykonajPrzeglad(s);
	}
}
