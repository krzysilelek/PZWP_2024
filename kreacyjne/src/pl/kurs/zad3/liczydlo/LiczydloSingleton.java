package pl.kurs.zad3.liczydlo;

public class LiczydloSingleton {
	private volatile static LiczydloSingleton INSTANCE;
	
	private LiczydloSingleton() {
		
	}
	
	public static LiczydloSingleton getInstance() {
		if(INSTANCE == null) {
			synchronized(LiczydloSingleton.class) {
				if(INSTANCE==null) {
					INSTANCE = new LiczydloSingleton();
				}
			}
		}
		return INSTANCE;
	}
	
	public void obliczenia1() {
		System.out.println("Wykonuję obliczenia nr 1");
	}
	public void obliczenia2() {
		System.out.println("Wyjkonuję obliczenia nr 2");
	}
}
