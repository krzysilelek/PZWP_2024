package ex1.state;

public interface ILionState {
	
	public void poke(LionContext lion);

    public void feed(LionContext lion);

    public void sing(LionContext lion);

    public void takeFood(LionContext lion);
    
}
