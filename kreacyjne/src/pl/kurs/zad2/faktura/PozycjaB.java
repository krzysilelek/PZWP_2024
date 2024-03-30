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

    public static class Builder {
        private String opis;
        private int ilosc;
        private double cena;
        private int vat;
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
