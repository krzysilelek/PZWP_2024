package zad1.mediator;

public class Start {

    public static void main(String[] args) {
        new Start();
    }

    public Start() {
    	IMediator mediator = new Mediator();
    	Auction auction = new Auction(10);
    	mediator.registerColleague(auction, new Client("Adam", 40));
    	mediator.registerColleague(auction, new Client("Olek", 30));
        
    	
        for (double i = 0.0; i < 200.0; i += 10.0) {
            auction.setPrice(i);
        }
    }
}