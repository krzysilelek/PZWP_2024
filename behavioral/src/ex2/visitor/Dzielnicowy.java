package ex2.visitor;

public class Dzielnicowy extends JednostkaPolicji {

    String nazwiskoDzielnicowego = "Kowalski";
    double powierzchnia = 100;
    
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}