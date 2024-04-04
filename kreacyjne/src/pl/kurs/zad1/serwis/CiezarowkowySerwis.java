package pl.kurs.zad1.serwis;

public class CiezarowkowySerwis extends ASerwis{

	@Override
	public Samochod przygotujSamochod() {
		Samochod car = new SamochodCiezarowy();
		car.sprawdzPlyny();
		car.zatankuj();
		return car;
	}


}
