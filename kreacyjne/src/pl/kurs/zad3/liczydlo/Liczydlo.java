package pl.kurs.zad3.liczydlo;

public class Liczydlo {
	public Liczydlo() {};
	public void obliczenia1() {
		System.out.println("Wykonuję obliczenia nr 1");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void obliczenia2() {
		System.out.println("Wyjkonuję obliczenia nr 2");
	}
}
