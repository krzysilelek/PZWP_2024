package ex2.visitor;

import java.util.List;

public class VisitorPowierzchni implements IVisitor{

	@Override
	public void visit(List<JednostkaPolicji> jednostki) {
		for(JednostkaPolicji jednostka : jednostki) {
			jednostka.accept(this);
		}
	}

	@Override
	public void visit(JednostkaPolicji jednostka) {
		// do Nothing
	}

	@Override
	public void visit(Dzielnicowy jednostka) {
		System.out.println("Dzielnica: " + jednostka.powierzchnia);
	}

	@Override
	public void visit(Posterunek jednostka) {
		System.out.println("Posterunek: " + (jednostka.szerokosc * jednostka.dlugosc));
	}

	@Override
	public void visit(KomendaGlowna jednostka) {
		System.out.println("KG: " + jednostka.obszar);
	}

	@Override
	public void visit(ABW jednostka) {
		System.out.println("ABW: Cała Polska");
	}

}
