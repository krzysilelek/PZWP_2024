package pl.kurs.zad1.serwis;
public class Klient {
	public static void main(String[] args) {
		new Klient();
	}
	public Klient() {
		Serwis serwis = new Serwis();
		serwis.nadajFabryke(new SamochodOsobowyFabryka());
		ISamochod mojSamochod = serwis.przygotujSamochod();
		mojSamochod.test();
		
		System.out.println("================================================================");
		
		serwis.nadajFabryke(new SamochodCiezarowyFabryka());
		ISamochod mojSamochod2 = serwis.przygotujSamochod();
		mojSamochod2.test();
		
		System.out.println("================================================================");
		
		serwis.nadajFabryke(new SamochodRajdowyFabryka());
		ISamochod mojSamochod3 = serwis.przygotujSamochod();
		mojSamochod3.test();
	}
}

