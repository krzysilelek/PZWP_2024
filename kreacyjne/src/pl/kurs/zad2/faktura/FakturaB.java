package pl.kurs.zad2.faktura;

import java.util.ArrayList;
import java.util.List;

public class FakturaB {
    private String kontrahent;
    private List<PozycjaB> pozycje = new ArrayList<PozycjaB>();

    public String getKontrahent() {
        return kontrahent;
    }

    public void setKontrahent(String kontrahent) {
        this.kontrahent = kontrahent;
    }

    public List<PozycjaB> getPozycje() {
        return pozycje;
    }
}