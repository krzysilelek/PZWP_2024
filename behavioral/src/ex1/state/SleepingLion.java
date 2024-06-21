package ex1.state;

public class SleepingLion implements ILionState {
    @Override
    public void poke(LionContext context) {
        System.out.println("Does not respond");
    }

    @Override
    public void feed(LionContext context) {
        System.out.println("Starts eating");
        context.setState(new EatingLion());
    }

    @Override
    public void sing(LionContext context) {
        System.out.println("Wakes up");
        context.setState(new WalkingLion());
    }

    @Override
    public void takeFood(LionContext context) {
        System.out.println("There is nothing to take away");
    }
}

