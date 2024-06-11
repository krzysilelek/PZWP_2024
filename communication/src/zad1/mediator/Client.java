package zad1.mediator;

public class Client implements IColleague{

    String name;
    double maxPrice;
    private IMediator mediator;

    public Client(String name, double maxPrice) {
        this.name = name;
        this.maxPrice = maxPrice;
    }

	@Override
	public void update(double newPrice) {
		System.out.println("Client " + name + " has been notified about new price: " + newPrice);
	    if (newPrice > maxPrice) {
	    	System.out.println("Client " + name + " disconnected from auction (maxPrice has been reached " + maxPrice + ").");
            mediator.unregisterColleague(this);
        }
    }

	@Override
	public void setMediator(IMediator newMediator) {
		this.mediator = newMediator;
	}
}
