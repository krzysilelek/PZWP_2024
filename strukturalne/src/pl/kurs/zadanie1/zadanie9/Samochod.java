package pl.kurs.zadanie1.zadanie9;

public class Samochod{
	String marka;
	String silnik;
	boolean klimatyzacja;

	public Samochod(String marka, String silnik, boolean klimatyzacja) {
		this.marka = marka;
		this.klimatyzacja = klimatyzacja;
		this.silnik = silnik;
	}
	
	public String pobierzSilnik() {
		return silnik;
	}
	
	public boolean pobierzKlimatyzacje() {
		return klimatyzacja;
	}
	
	public String toString() {
		return marka;
	}
}
