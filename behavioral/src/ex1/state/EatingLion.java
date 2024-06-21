package ex1.state;

public class EatingLion implements ILionState {
	
    @Override
    public void poke(LionContext context) {
        System.out.println("Growls");
    }

    @Override
    public void feed(LionContext context) {
        System.out.println("Already eating");
    }

    @Override
    public void sing(LionContext context) {
        System.out.println("Growls");
    }

    @Override
    public void takeFood(LionContext context) {
        System.out.println("Food taken away");
        context.setState(new WalkingLion());
    }
}

