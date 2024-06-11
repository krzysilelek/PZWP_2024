package zad1.observer;

public class Client implements IObserver{

    String name;
    double maxPrice;

    public Client(String name, double maxPrice) {
        this.name = name;
        this.maxPrice = maxPrice;
    }

	@Override
	public void update(double newPrice) {
        System.out.println("Client " + name + " has been notified about new price: " + newPrice);
        if (newPrice > maxPrice) {
            System.out.println("Client " + name + " disconnected from auction (maxPrice has been reached " + maxPrice + ").");
        }
    }
}
