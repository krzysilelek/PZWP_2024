package pl.kurs.zadanie1.zadanie9;
public class Klient {
	public static void main(String[] args) {
		Samochod s = new Samochod("Fiat Punto", "diesel",true);
		FasadaPrzeglad.przeglad(s, true, false);
		s = new Samochod("Ford Mondeo", "benzyna", false);
		FasadaPrzeglad.przeglad(s, true, true);
	}
}
