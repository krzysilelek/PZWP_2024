package pl.kurs.zad1.serwis;
public class SamochodOsobowy implements Samochod{
	public void zatankuj() {
		System.out.println(this+" Tankowanie samochodu ");
	}
	public void sprawdzPlyny() { 
		System.out.println(this+" Sprawdzanie płynów samochodu ");
	}
	public void test() {
		System.out.println("Samochód "+this+" gotowy");
	}
	
}


