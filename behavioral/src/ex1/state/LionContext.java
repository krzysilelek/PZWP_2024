package ex1.state;

public class LionContext implements ILion {
	private ILionState currentState;
	
	public LionContext() {
		this.currentState = new WalkingLion();
	}
	
	public void setState(ILionState newState) {
		this.currentState = newState;
	}

	@Override
	public void poke() {
		currentState.poke(this);
	}

	@Override
	public void feed() {
		currentState.feed(this);
	}

	@Override
	public void sing() {
		currentState.sing(this);
	}

	@Override
	public void takeFood() {
		currentState.takeFood(this);
	}
}
