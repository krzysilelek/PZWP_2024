package zad1.observer;

public class Start {

    public static void main(String[] args) {
        new Start();
    }

    public Start() {
        Auction auction = new Auction(10);
        auction.registerObserver(new Client("Adam", 40));
        auction.registerObserver(new Client("Olek", 30));
        
        auction.printObserverList();
        for (double i = 0.0; i < 200.0; i += 10.0) {
            auction.setPrice(i);
        }
        auction.printObserverList();
    }
}