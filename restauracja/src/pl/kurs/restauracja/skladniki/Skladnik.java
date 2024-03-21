package pl.kurs.restauracja.skladniki;

public abstract class Skladnik {
	String nazwa;
	int ilosc;
	
	public Skladnik(String nazwa, int ilosc) {
		this.nazwa = nazwa;
		this.ilosc = ilosc;
	}
	
	@Override
	public String toString() {
		return nazwa;
	}
	
	public void dodajSkladnik() {
		System.out.println("Dodaję składnik "+nazwa);
	}
	
	public abstract void przygotuj();
}
