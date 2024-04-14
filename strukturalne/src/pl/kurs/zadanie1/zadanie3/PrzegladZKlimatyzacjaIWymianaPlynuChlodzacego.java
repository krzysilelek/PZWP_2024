package pl.kurs.zadanie1.zadanie3;

public class PrzegladZKlimatyzacjaIWymianaPlynuChlodzacego extends APrzeglad{

	@Override
	protected void wymienOlej(Samochod s) {
		System.out.println("Wymieniam olej w "+s);
	}

	@Override
	protected void wymienSwiece(Samochod s) {
		System.out.println("Wymieniam świece w "+s);
	}

	@Override
	protected void wymienFiltry(Samochod s) {
		System.out.println("Wymieniam filtry w "+s);
	}
	
	@Override
	protected void sprawdzanieCisnieniaWOponach(Samochod s) {
		
	}

	@Override
	protected void sprawdzKlimatyzacje(Samochod s) {
		System.out.println("Sprawdzam klimatyzację w "+s);
	}

	@Override
	protected void wymienPlynChlodzacy(Samochod s) {
		System.out.println("Sprawdzam ciśnienie opon w "+s);
	}

}
