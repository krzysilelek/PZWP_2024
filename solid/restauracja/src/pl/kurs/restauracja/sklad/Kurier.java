package pl.kurs.restauracja.sklad;

import pl.kurs.restauracja.zupy.Zupa;

public class Kurier implements IKurier{

	@Override
	public void podaj(Zupa zupa, String adres) {
		System.out.println("Zawożę zupę: "+zupa.pobierzNazwe()+" na adres "+adres);
	}
}
