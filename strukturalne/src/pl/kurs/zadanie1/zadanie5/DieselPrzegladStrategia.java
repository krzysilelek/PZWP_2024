package pl.kurs.zadanie1.zadanie5;

public class DieselPrzegladStrategia implements IPrzegladStrategia{

	@Override
	public void wykonajPrzeglad(Samochod s) {
		System.out.println("Zaczynam przegląd bazowy samochodu "+s);
		wymienOlej(s);
		wymienFiltry(s);
		System.out.println("Przegląd bazowy samochodu "+s+" zakończony");
	}

	private void wymienOlej(Samochod s) {
		System.out.println("Wymieniam olej w "+s);
	}
	
	private void wymienFiltry(Samochod s) {
		System.out.println("Wymieniam filtry w "+s);
	}
	
}
