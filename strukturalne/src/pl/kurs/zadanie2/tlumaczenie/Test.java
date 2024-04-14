package pl.kurs.zadanie2.tlumaczenie;

public class Test {

	public static void main(String[] args) {
		Tlumaczenie tlumaczenie = new Tlumaczenie(new Angielski());
		System.out.println(tlumaczenie.przetlumacz(""));
	}

}
