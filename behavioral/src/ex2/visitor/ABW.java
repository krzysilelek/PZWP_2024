package ex2.visitor;

public class ABW extends JednostkaPolicji {

    int obszar;

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
