package pl.kurs.zad2.faktura;

public class PozycjaB {
    private String opis;
    private int ilosc;
    private double cena;
    private int vat;
    private String ku;

    private PozycjaB(Builder builder) {
        this.opis = builder.opis;
        this.ilosc = builder.ilosc;
        this.cena = builder.cena;
        this.vat = builder.vat;
        this.ku = builder.ku;
    }
    
    public void wypiszPozycje() {
    	System.out.println("Opis "+opis);
    	System.out.println("Ilość "+ilosc);
    	System.out.println("Cena "+cena);
    	System.out.println("Vat "+vat);
    	System.out.println("Ku "+ku);
    }

    public static class Builder {
        private String opis = "";
        private int ilosc = 0;
        private double cena = 0.0;
        private int vat = 0;
        private String ku = "";

        public Builder(String opis, int ilosc) {
            this.opis = opis;
            this.ilosc = ilosc;
        }

        public Builder cena(double cena) {
            this.cena = cena;
            return this;
        }

        public Builder vat(int vat) {
            this.vat = vat;
            return this;
        }

        public Builder ku(String ku) {
            this.ku = ku;
            return this;
        }

        public PozycjaB build() {
            return new PozycjaB(this);
        }
    }
}
