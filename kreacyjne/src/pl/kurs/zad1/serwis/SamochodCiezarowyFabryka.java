package pl.kurs.zad1.serwis;

public class SamochodCiezarowyFabryka implements ISamochodFabryka{
	@Override
	public ISamochod przygotujSamochod() {
		return new SamochodCiezarowy();
	}
}
