package pl.kurs.zad2.faktura;

import java.util.ArrayList;
import java.util.List;

public class FakturaB {
    private String kontrahent;
    private List<PozycjaB> pozycje = new ArrayList<PozycjaB>();

    public String pobierzKontrahent() {
        return kontrahent;
    }

    public void ustawKontrahent(String kontrahent) {
        this.kontrahent = kontrahent;
    }

    public List<PozycjaB> pobierzPozycje() {
        return pozycje;
    }
    
    public void ustawPozycje(PozycjaB pozycja) {
    	pozycje.add(pozycja);
    }
    
    public void wypiszFakture() {
    	System.out.println("Kontrahent: "+kontrahent);
    	for(PozycjaB pozycja:pozycje) {
    		pozycja.wypiszPozycje();
    	}
    }
}