package ex2.visitor;

public class Posterunek extends JednostkaPolicji {

    String nazwiskoKomendanta = "Adamski";
    int dlugosc = 10;
    int szerokosc = 20;
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
