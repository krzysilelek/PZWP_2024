package ex2.visitor;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        new Test();
    }
    List<JednostkaPolicji> jednostki;

    public Test() {
        jednostki = new ArrayList<JednostkaPolicji>();
        jednostki.add(new Dzielnicowy());
        jednostki.add(new Posterunek());
        jednostki.add(new KomendaGlowna());
        jednostki.add(new ABW());

        System.out.println("====Szefowie=====");
        wypiszSzefow();
        System.out.println("====Powierzchnie=====");
        wypiszPowierzchnie();

    }

    public void wypiszSzefow() {
        VisitorSzefow visitor = new VisitorSzefow();
        visitor.visit(jednostki);
    }

    public void wypiszPowierzchnie() {
    	VisitorPowierzchni visitor = new VisitorPowierzchni();
        visitor.visit(jednostki);
    }
}