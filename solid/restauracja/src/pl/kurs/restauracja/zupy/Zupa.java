package pl.kurs.restauracja.zupy;

import java.util.ArrayList;
import java.util.List;

import pl.kurs.restauracja.skladniki.Skladnik;

public class Zupa {
	private List<Skladnik> skladniki = new ArrayList<Skladnik>();
	
	private String nazwa;
	
	public List<Skladnik> pobierzSkladniki(){
		return skladniki;
	}
	
	public void dodajSkladnik(Skladnik skladnik) {
		skladniki.add(skladnik);
	}
	
	public String pobierzNazwe() {
		return nazwa;
	}
	
	public void nadajNazwe(String nazwa) {
		this.nazwa = nazwa;
	}
	
	/*
	public void przygotuj() {
		System.out.println("Przygotowanie zupy ze składników: "+skladniki);
		System.out.println("Nalewam wodę do garnka");
		System.out.println("Wrzucam kostkę rosołową");
		nazwa = "rosół";
		for(Skladnik skladnik:skladniki) {
			if(skladnik instanceof Marchewka) {
				Marchewka marchewka = (Marchewka)skladnik;
				marchewka.obierz();
				marchewka.pokroj();
			}
			if(skladnik instanceof Makaron) {
				Makaron makaron = (Makaron)skladnik;
				makaron.gotuj();
			}
			
		}
			
	}
	
	public void podaj() {
		System.out.println("Podanie obiadu");
		System.out.println("Podaję "+nazwa+ " do stołu");
	}
	*/
}
