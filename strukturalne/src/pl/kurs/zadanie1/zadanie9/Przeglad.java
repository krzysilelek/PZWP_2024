package pl.kurs.zadanie1.zadanie9;
public class Przeglad {
	private void wymienOlej(Samochod s) {
		System.out.println("Wymieniam olej w "+s);
	}
	private void wymienSwiece(Samochod s) {
		System.out.println("Wymieniam �wiece w "+s);
	}
	private void wymienFiltry(Samochod s) {
		System.out.println("Wymieniam filtry w "+s);
	}
	public void wykonajPrzeglad(Samochod s) {
		System.out.println("Zaczynam przegl�d samochodu "+s);
		wymienOlej(s);
		wymienFiltry(s);
		wymienSwiece(s);
		System.out.println("Przegl�d samochodu "+s+" zako�czony");
	}
}

