package pl.kurs.zad1.serwis;

public class OsobowySerwis extends ASerwis{
	
	@Override
	public Samochod przygotujSamochod() {
		Samochod car = new SamochodOsobowy();
		
		car.sprawdzPlyny();
		car.zatankuj();
		return car;
	}
}
