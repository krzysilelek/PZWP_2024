package pl.kurs.zadanie1.zadanie3;

public class Klient {
	public static void main(String[] args) {
		Samochod s = new Samochod("Fiat Punto");
		APrzeglad przeglad = new PrzegladDiesel();
		przeglad.wykonajPrzeglad(s);

		przeglad = new PrzegladZKlimatyzacja();
		s = new Samochod("Ford Mondeo");
		przeglad.wykonajPrzeglad(s);
		
		przeglad = new Przeglad();
		s = new Samochod("Opel Astra");
		przeglad.wykonajPrzeglad(s);
		
		przeglad = new PrzegladZCisnieniemOpon();
		s = new Samochod("BMW E36");
		przeglad.wykonajPrzeglad(s);
		
		przeglad = new PrzegladZKlimatyzacjaIWymianaPlynuChlodzacego();
		s = new Samochod("Hyundai i20");
		przeglad.wykonajPrzeglad(s);
	}
}
