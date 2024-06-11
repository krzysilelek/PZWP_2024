package zad1.observer;

import java.util.ArrayList;
import java.util.List;

public class Auction implements ISubject{

    private double price;
    private List<IObserver> observersList;

    public void printObserverList() {
    	System.out.println("Observers:");
    	for(IObserver observer : observersList) {
    		Client klient = (Client) observer;
    		System.out.println(klient.name);
    	}
    }
    public Auction(double price) {
        this.price = price;
        this.observersList = new ArrayList<>();
    }

    public void setPrice(double price) {
    	this.price = price;
    	notifyObservers();
    }

    public double getPrice() {
        return price;
    }

	@Override
	public void registerObserver(IObserver observer) {
		observersList.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		observersList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		List<IObserver> observersToRemove = new ArrayList<>();
        for (IObserver observer : observersList) {
            observer.update(price);
            Client client = (Client) observer;
            if (price > client.maxPrice) {
                    observersToRemove.add(observer);
            }
        }
        observersList.removeAll(observersToRemove);
	}
}
