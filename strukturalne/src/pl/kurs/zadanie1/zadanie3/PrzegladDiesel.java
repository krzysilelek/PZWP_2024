package pl.kurs.zadanie1.zadanie3;

public class PrzegladDiesel extends APrzeglad{

	@Override
	protected void wymienOlej(Samochod s) {
		System.out.println("Wymieniam olej w "+s);
	}

	@Override
	protected void wymienSwiece(Samochod s) {
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void wymienPlynChlodzacy(Samochod s) {
		// TODO Auto-generated method stub
		
	}
}
