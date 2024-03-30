package pl.kurs.zad2.faktura;

public class Test {
	public static void main(String[] args) {
		//Faktura faktura = new Faktura();
		//faktura.setKontrahent("Krzaczek Sp. z o.o.");
		//faktura.getPozycje().add(new Pozycja("komputer",1,1000));
		//faktura.getPozycje().add(new Pozycja("drukarka",2,300,23));
		//faktura.getPozycje().add(new Pozycja("myszka",2,23,23,""));
		//faktura.getPozycje().add(new Pozycja("montaz",1,300,7,"234"));
		
		FakturaB fakturab = new FakturaB();
		fakturab.setKontrahent("Krzaczek Sp. z o.o.");
		fakturab.getPozycje().add(new PozycjaB.Builder("komputer",1).cena(1000).build());
		fakturab.getPozycje().add(new PozycjaB.Builder("drukarka",2).cena(300).vat(23).build());
	}
}
