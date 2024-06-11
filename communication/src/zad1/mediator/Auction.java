package zad1.mediator;

public class Auction implements IColleague{

    private double price;
    private IMediator mediator;

    public Auction(double price) {
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
        mediator.notifyColleagues(this, price);
    }

    public double getPrice() {
        return price;
    }

	@Override
	public void update(double newPrice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMediator(IMediator newMediator) {
		this.mediator = newMediator;
	}
}
