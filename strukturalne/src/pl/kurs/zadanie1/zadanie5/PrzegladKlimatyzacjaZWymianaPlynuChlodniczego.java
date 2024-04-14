package pl.kurs.zadanie1.zadanie5;

public class PrzegladKlimatyzacjaZWymianaPlynuChlodniczego implements IPrzegladStrategia{
	private void wymienOlej(Samochod s) {
		System.out.println("Wymieniam olej w "+s);
	}
	private void wymienSwiece(Samochod s) {
		System.out.println("Wymieniam świece w "+s);
	}
	private void wymienFiltry(Samochod s) {
		System.out.println("Wymieniam filtry w "+s);
	}
	private void sprawdzKlimatyzacje(Samochod s) {
		System.out.println("Sprawdzam klimatyzacje w "+s);
	}
	
	private void wymienPlynChlodniczy(Samochod s) {
		System.out.println("Wymieniam płyn chłodniczy");
	}
	
	@Override
	public void wykonajPrzeglad(Samochod s) {
		System.out.println("Zaczynam przegląd samochodu "+s);
		wymienOlej(s);
		wymienFiltry(s);
		wymienSwiece(s);
		sprawdzKlimatyzacje(s);
		wymienPlynChlodniczy(s);
		System.out.println("Przegląd samochodu "+s+" zakończony");
	}
}
