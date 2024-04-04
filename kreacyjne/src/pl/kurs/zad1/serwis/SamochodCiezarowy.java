package pl.kurs.zad1.serwis;
public class SamochodCiezarowy implements Samochod{
	public void zatankuj() {
		System.out.println(this+" Tankowanie ciężarówki ");
	}
	public void sprawdzPlyny() { 
		System.out.println(this+" Sprawdzanie płynów cięarówki");
	}
	public void test() {
		System.out.println("Ciężarówka "+this+" gotowa");
	}
}
