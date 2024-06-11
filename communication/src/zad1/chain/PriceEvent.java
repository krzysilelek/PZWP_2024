package zad1.chain;

public class PriceEvent implements IEvent{

	private double price;
	
	public PriceEvent(double price) {
		this.price = price;
	}
	
	@Override
	public double getInfo() {
		return price;
	}

}
