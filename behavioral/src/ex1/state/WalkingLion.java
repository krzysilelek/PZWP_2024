package ex1.state;

public class WalkingLion implements ILionState {
    @Override
    public void poke(LionContext context) {
        System.out.println("Charges at the bars");
    }

    @Override
    public void feed(LionContext context) {
        System.out.println("Starts eating");
        context.setState(new EatingLion());
    }

    @Override
    public void sing(LionContext context) {
        System.out.println("Falls asleep");
        context.setState(new SleepingLion());
    }

    @Override
    public void takeFood(LionContext context) {
        System.out.println("There is nothing to take away");
    }
}

