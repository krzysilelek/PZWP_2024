package pl.kurs.zadanie1.zadanie9;

public class FasadaPrzeglad {
	
	static PrzegladSilnik silnikP = new PrzegladSilnik();
	static PrzegladKlimatyzacja klimatyzacjaP = new PrzegladKlimatyzacja();
	static PrzegladOpon oponyP = new PrzegladOpon();
	static PrzegladPlynowChlodniczych plynyCP = new PrzegladPlynowChlodniczych();
	
	public static void przeglad(Samochod s, boolean sprawdzCisnienie, boolean sprawdzPlynChlodniczy) {
		System.out.println("Rozpoczynam przegląd w "+s);
		
		if(s.pobierzSilnik() == "benzyna") {
			silnikP.wymienSwiece(s);
		}
		silnikP.wymienOlej(s);
		silnikP.wymienFiltry(s);
		
		if(s.pobierzKlimatyzacje() == true) {
			klimatyzacjaP.sprawdzKlimatyzacje(s);
		}
		
		if(sprawdzCisnienie) {
			oponyP.sprawdzOpony(s);
		}
		
		if(sprawdzPlynChlodniczy) {
			plynyCP.wymienPlynChlodniczy(s);
		}
		
		System.out.println("Przegląd w "+s+" zakończony");
	}
}
