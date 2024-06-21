package ex2.visitor;

import java.awt.Dimension;

public class KomendaGlowna extends JednostkaPolicji {

    String komendant = "Papala";
    Dimension obszar = new Dimension(200, 100);
	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);
	}
}
