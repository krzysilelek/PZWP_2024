package pl.kurs.zad3.liczydlo;

public class Test {
	public static void main(String[] args) {
		Liczydlo o1 = new Liczydlo();
		o1.obliczenia1();
		o1.obliczenia2();
		
		LiczydloSingleton o2 = LiczydloSingleton.getInstance();
		o2.obliczenia1();
		o2.obliczenia2();
		
		LiczydloSingleton o22 = LiczydloSingleton.getInstance();
		
		System.out.println(o2==o22);
		
		LiczydloPool o3 = LiczydloPool.getInstance();
		
		for(int i=1;i<=5;i++) {
			final int index = i;
			Thread thread = new Thread( () -> {
				System.out.println("Attempt: "+index);
				Liczydlo liczydlo = o3.accquire();
				if(liczydlo!=null) {
					liczydlo.obliczenia1();
					liczydlo.obliczenia2();
					o3.free(liczydlo);
				}
				else {
					System.out.println("No free objects!");
				}
			});
			thread.start();
		}
		
	}
}
