package zad2.chain;

import java.util.ArrayList;
import java.util.List;

public final class Test {

	List<JednostkaPolicji> jednostki;
	List<String> meldunki;
	
    public static void main(String[] args) {
        new Test();
    }
    
    
    public Test() {
        jednostki = new ArrayList<>();
        jednostki.add(new Dzielnicowy("Dzielnicowy"));
        jednostki.add(new Posterunek("Posterunek"));
        jednostki.add(new KomendaGlowna("Komenda Główna"));
        jednostki.add(new ABW("ABW"));
        
        for(int i = 0; i < jednostki.size()-1; i++) {
        	jednostki.get(i).setKolejnaJednostka(jednostki.get(i+1));
        }
        
        meldunki = new ArrayList<>();
        meldunki.add("Kradzież samochodu");
        meldunki.add("Alarm terrorystyczny");
        meldunki.add("Zgłoszenie rozboju");
        meldunki.add("Atak mafii!");  
        meldunki.add("Spanie w autobusie!");
        
        for(String meldunek : meldunki) {
        	System.out.println("Meldunek: " + meldunek);
        	if(jednostki.get(0).przyjmijMeldunek(meldunek)) {
            	System.out.println("Wykonano meldunek");
            }
            else {
            	System.out.println("Nie wykonano meldunku");
            }
        	System.out.println("=========================");
        }
    }
}