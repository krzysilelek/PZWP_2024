package pl.kurs.zadanie1.zadanie3;

public abstract class APrzeglad {
	protected abstract void wymienOlej(Samochod s);
	protected abstract void wymienSwiece(Samochod s);
	protected abstract void wymienFiltry(Samochod s);
	protected abstract void sprawdzKlimatyzacje(Samochod s);
	
	//zad7
	protected abstract void sprawdzanieCisnieniaWOponach(Samochod s);
	
	//zad8
	protected abstract void wymienPlynChlodzacy(Samochod s);
	
	
	public void wykonajPrzeglad(Samochod s) {
		System.out.println("Zaczynam przegląd samochodu "+s);
		wymienOlej(s);
		wymienFiltry(s);
		wymienSwiece(s);
		sprawdzKlimatyzacje(s);
		sprawdzanieCisnieniaWOponach(s);
		wymienPlynChlodzacy(s);
		System.out.println("Przegląd samochodu "+s+" zakończony");
	}
}

