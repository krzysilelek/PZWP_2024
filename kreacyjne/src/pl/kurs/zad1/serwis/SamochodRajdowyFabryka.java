package pl.kurs.zad1.serwis;

public class SamochodRajdowyFabryka implements ISamochodFabryka{

	@Override
	public ISamochod przygotujSamochod() {
		return new SamochodRajdowy();
	}
}
