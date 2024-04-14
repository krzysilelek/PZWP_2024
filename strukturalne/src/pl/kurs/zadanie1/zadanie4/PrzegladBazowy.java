package pl.kurs.zadanie1.zadanie4;

public class PrzegladBazowy implements IPrzeglad{
	
	public void wymienOlej(Samochod s) {
		System.out.println("Wymieniam olej w "+s);
	}
	
	public void wymienFiltry(Samochod s) {
		System.out.println("Wymieniam filtry w "+s);
	}
	
	@Override
	public void wykonajPrzeglad(Samochod s) {
		System.out.println("Zaczynam przegląd samochodu "+s);
		wymienOlej(s);
		wymienFiltry(s);
	}
}

