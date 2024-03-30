package pl.kurs.zad2.faktura;

import java.util.ArrayList;
import java.util.List;

public class Faktura {
	private String kontrahent;
	private List<Pozycja> pozycje = new ArrayList<Pozycja>();
	public String getKontrahent() {
		return kontrahent;
	}
	public void setKontrahent(String kontrahent) {
		this.kontrahent = kontrahent;
	}
	public List<Pozycja> getPozycje() {
		return pozycje;
	}
	
	
}
