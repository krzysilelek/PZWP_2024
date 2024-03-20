package pl.kurs.restauracja.sklad;

import pl.kurs.restauracja.zupy.Zupa;

public class Kelner implements IKelner{
	
	@Override
	public void podaj(Zupa zupa) {
		System.out.println("Podaję zupę: "+zupa.pobierzNazwe());
	}

	@Override
	public void nakryjStoi() {
		System.out.println("Nakrywam stół");
	}

	@Override
	public void zbierzNaczynia() {
		System.out.println("Zbieram naczynia");
	}
}
