package pl.kurs.zad1.serwis;

public class SamochodRajdowy implements ISamochod{

	@Override
	public void zatankuj() {
		System.out.println(this+" Tankowanie rajdówki");
	}

	@Override
	public void sprawdzPlyny() {
		System.out.println(this+" Sprawdzanie płynów rajdówki");
	}

	@Override
	public void test() {
		System.out.println("Rajdówka "+this+" gotowy");
	}
}
