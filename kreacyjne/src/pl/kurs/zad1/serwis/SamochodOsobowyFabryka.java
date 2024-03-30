package pl.kurs.zad1.serwis;

public class SamochodOsobowyFabryka implements ISamochodFabryka{
	@Override
	public ISamochod przygotujSamochod() {
		return new SamochodOsobowy();
	}
}
