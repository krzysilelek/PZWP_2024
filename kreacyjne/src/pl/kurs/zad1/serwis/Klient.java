package pl.kurs.zad1.serwis;
public class Klient {
	public static void main(String[] args) {
		new Klient();
	}
	public Klient() {
		//Serwis serwis = new Serwis();
		//Samochod mojSamochod = serwis.przygotujSamochod("osobowy");
		//mojSamochod.test();
		//Samochod mojSamochod2 = serwis.przygotujSamochod("ciężarowy");
		//mojSamochod2.test();
		
		ASerwis serwis = new OsobowySerwis();
		Samochod mojSamochod = serwis.przygotujSamochod();
		mojSamochod.test();
		serwis = new CiezarowkowySerwis();
		Samochod mojSamochod2 = serwis.przygotujSamochod();
		mojSamochod2.test();
	}
	

}

