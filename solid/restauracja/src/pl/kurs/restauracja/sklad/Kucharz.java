package pl.kurs.restauracja.sklad;

import pl.kurs.restauracja.skladniki.*;
import pl.kurs.restauracja.zupy.Zupa;

public class Kucharz implements IKucharz{
	
	@Override
	public void przygotuj(Zupa zupa) {
		System.out.println("Przygotowanie zupy ze składników: " + zupa.pobierzSkladniki());
		
		System.out.println("Nalewam wodę do garnka");
		
		for(Skladnik skladnik:zupa.pobierzSkladniki()) {
			skladnik.przygotuj();
			skladnik.dodajSkladnik();
		}
		System.out.println("Ugotowałem zupę: "+zupa.pobierzNazwe());
	}
}
