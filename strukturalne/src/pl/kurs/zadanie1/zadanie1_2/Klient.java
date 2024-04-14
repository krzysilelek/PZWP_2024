package pl.kurs.zadanie1.zadanie1_2;

public class Klient {
	public static void main(String[] args) {
		Samochod s = new Samochod("Fiat Punto");
		Przeglad przeglad = new Przeglad();
		przeglad.wykonajPrzeglad(s);

		PrzegladZKlimatyzacja przeglad2 = new PrzegladZKlimatyzacja();
		s = new Samochod("Ford Mondeo");
		przeglad2.wykonajPrzeglad(s);
		
		PrzegladDiesel przeglad3 = new PrzegladDiesel();
		s = new Samochod("Opel Astra");
		przeglad3.wykonajPrzeglad(s);
	}
}
