package zad1;

public class Test {
    public static void main(String[] args) {
    	Location s = new Location("Polska");
    	Location l = new Location("Kraków");
    	s.addElement(l);
    	l.addElement(new Car("Fiat"));
    	l.addElement(new Car("Opel"));
    	l = new Location("Warszawa");
    	l.addElement(new Car("Mercedes"));
    	s.addElement(l); 
    	s.addElement(new Car("Ford"));
    	s.info();
    }
}
