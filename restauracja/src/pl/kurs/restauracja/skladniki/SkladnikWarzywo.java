package pl.kurs.restauracja.skladniki;

public class SkladnikWarzywo extends Skladnik{
	
	SkladnikWarzywo(String nazwa, int ilosc){
		super(nazwa, ilosc);
	}
	
	public void obierz() {
		System.out.println("Obieranie marchewki");
	}
	public void pokroj() {
		System.out.println("Krojenie marchewki");
	}
	
	@Override
	public void przygotuj(){
		obierz();
		pokroj();
	}
}
