package pl.kurs.zadanie1.zadanie1_2;

public class Przeglad {
	
	private void wymienOlej(Samochod s) {
		System.out.println("Wymieniam olej w "+s);
	}
	
	protected void wymienSwiece(Samochod s) {
		System.out.println("Wymieniam świece w "+s);
	}
	
	private void wymienFiltry(Samochod s) {
		System.out.println("Wymieniam filtry w "+s);
	}
	
	public void wykonajPrzeglad(Samochod s) {
		System.out.println("Zaczynam przegląd samochodu "+s);
		wymienOlej(s);
		wymienFiltry(s);
		wymienSwiece(s);
		System.out.println("Przegląd samochodu "+s+" zakończony");
	}
}

