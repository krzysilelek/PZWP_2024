package pl.kurs.zad1.serwis;

public class Serwis {
	
	private ISamochodFabryka samochodFabryka;
	
	public void nadajFabryke(ISamochodFabryka samochodFabryka) {
		this.samochodFabryka = samochodFabryka;
	}
	
	public ISamochodFabryka pobierzFabryke() {
		return this.samochodFabryka;
	}
	
	public ISamochod przygotujSamochod() {
		ISamochod car = samochodFabryka.przygotujSamochod();

		car.sprawdzPlyny();
		car.zatankuj();
		return car;
	}

}
