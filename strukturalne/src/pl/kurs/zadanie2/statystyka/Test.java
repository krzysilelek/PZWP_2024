package pl.kurs.zadanie2.statystyka;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<IStatystyka> lista = new ArrayList<IStatystyka>();
		lista.add(new StatystykaA());
		lista.add(new StatystykaB());
		
		KalkulatorStatystyk k = new KalkulatorStatystyk(lista);
		List<Integer> l = k.obliczStatystyki("");
		
		for(int i : l) {
			System.out.println(i);
		}
	}

}
