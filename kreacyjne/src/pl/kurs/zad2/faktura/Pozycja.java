package pl.kurs.zad2.faktura;

public class Pozycja {
	public Pozycja(String opis, int ilosc, double cena, int vat, String ku) {
		super();
		this.opis = opis;
		this.ilosc = ilosc;
		this.cena = cena;
		this.vat = vat;
		this.ku = ku;
	}
	
	public Pozycja(String opis, int ilosc, double cena, int vat) {
		this(opis,ilosc,cena,vat,"");
	}
	public Pozycja(String opis, int ilosc, double cena) {
		this(opis,ilosc,cena,22);
	}
	public Pozycja(String opis, int ilosc) {
		this(opis,ilosc,100);
	}
	
	String opis;
	int ilosc;
	double cena;
	int vat;
	String ku;
	
}
