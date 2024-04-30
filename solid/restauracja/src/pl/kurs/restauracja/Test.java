package pl.kurs.restauracja;

import pl.kurs.restauracja.sklad.*;
import pl.kurs.restauracja.skladniki.*;
import pl.kurs.restauracja.zupy.Zupa;

public class Test {
	public static void main(String[] args) {
		System.out.println("=======================================================================");
		przygotuj(new Kucharz(), new Kelner());
		System.out.println("=======================================================================");
		przygotujNaWynos(new Kucharz(), new Kurier());
		System.out.println("=======================================================================");
	}
	
	public static void przygotuj(IKucharz kucharz, IKelner kelner) {	
		
		Zupa zupa = stworzZupe("Rosół z makaronem");
		Zupa zupa2 = stworzZupe("Pomidorówka z ryżem");
				
		kucharz.przygotuj(zupa);
		kucharz.przygotuj(zupa2);
		
		kelner.zbierzNaczynia();
		kelner.nakryjStoi();
		kelner.podaj(zupa);
		kelner.podaj(zupa2);
	}
	
	public static void przygotujNaWynos(IKucharz kucharz, IKurier kurier) {
		Zupa zupa = stworzZupe("Rosół z ryżem");
		Zupa zupa2 = stworzZupe("Pomidorówka z makaronem");
				
		kucharz.przygotuj(zupa);
		kucharz.przygotuj(zupa2);
		
		String adres = "Zabrze, Wolności 32A";
		kurier.podaj(zupa, adres);
		kurier.podaj(zupa2, adres);
	}
	
	public static Zupa stworzZupe(String nazwaZupy) {
		Zupa zupa = new Zupa();
		
		switch(nazwaZupy) {
			case "Rosół z makaronem":
				zupa.dodajSkladnik(new Makaron(1));
				zupa.dodajSkladnik(new Marchewka(1));
				zupa.dodajSkladnik(new Kostka(1));
				break;
			case "Rosół z ryżem":
				zupa.dodajSkladnik(new Ryz(1));
				zupa.dodajSkladnik(new Marchewka(1));
				zupa.dodajSkladnik(new Kostka(1));
				break;
			case "Pomidorówka z makaronem":
				zupa.dodajSkladnik(new Makaron(1));
				zupa.dodajSkladnik(new Marchewka(1));
				zupa.dodajSkladnik(new Koncentrat(1));
				break;
			case "Pomidorówka z ryżem":
				zupa.dodajSkladnik(new Ryz(1));
				zupa.dodajSkladnik(new Marchewka(1));
				zupa.dodajSkladnik(new Koncentrat(1));
				break;
			default:
	            throw new Error( "Nie ma takiej zupy w !");
		}
		
		zupa.nadajNazwe(nazwaZupy);
		
		return zupa;
	}
}


