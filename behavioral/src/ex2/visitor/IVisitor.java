package ex2.visitor;

import java.util.List;

public interface IVisitor {
	public void visit(List<JednostkaPolicji> jednostki);
	public void visit(JednostkaPolicji jednostka);
	public void visit(Dzielnicowy jednostka);
	public void visit(Posterunek jednostka);
	public void visit(KomendaGlowna jednostka);
	public void visit(ABW jednostka);
}
