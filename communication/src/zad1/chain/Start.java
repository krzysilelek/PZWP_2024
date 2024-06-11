package zad1.chain;

public class Start {

    public static void main(String[] args) {
        new Start();
    }

    public Start() {
        
    	Auction auction = new Auction(10);
        Client h1 = new Client("Adam", 40);
        Client h2 = new Client("Olek", 30);
        
        auction.setBaseHandler(h1);
        h1.setNext(h2);
        
        for (int i = 0; i < 200; i += 10) {
            auction.setPrice(i);
        }
    }
}