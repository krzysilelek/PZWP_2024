package pl.kurs.zadanie2.statystyka;

import java.util.ArrayList;
import java.util.List;

public class KalkulatorStatystyk {

	private List<IStatystyka> strategie;
	
	public KalkulatorStatystyk(List<IStatystyka> strategie) {
		 this.strategie = strategie;
	}
	
	public List<Integer> obliczStatystyki(String tekst) {
		 List<Integer> obliczone = new ArrayList<Integer>();
		 
		 for(IStatystyka s : strategie) {
			 obliczone.add(s.oblicz(tekst));
		 }
		 
		 return obliczone;
	}
}
