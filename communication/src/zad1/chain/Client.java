package zad1.chain;

public class Client implements IHandler{

    String name;
    double maxPrice;
    private IHandler nextHandler = null;

    public Client(String name, double maxPrice) {
        this.name = name;
        this.maxPrice = maxPrice;
    }

	@Override
	public void setNext(IHandler handler) {
		this.nextHandler = handler;
	}

	@Override
	public boolean postEvent(IEvent event) {
		if(nextHandler != null) return nextHandler.handleEvent(event);
		return false;
	}

	@Override
	public boolean handleEvent(IEvent event) {
		System.out.println("Client " + name + " has been notified about new price: " + event.getInfo());
		if(event.getInfo() > maxPrice) {
			System.out.println("Client " + name + " can't buy it (maxPrice has been reached " + maxPrice + ").");
			return postEvent(event);
		}
		return true;
	}
}
