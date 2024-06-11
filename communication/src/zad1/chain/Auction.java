package zad1.chain;

public class Auction {

    private double price;
    private IHandler baseHandler;
    
    public Auction(double price) {
        this.price = price;
    }
    
    public void setBaseHandler(IHandler handler) {
    	this.baseHandler = handler;
    }

    public void setPrice(double price) {
        this.price = price;
        if(baseHandler.handleEvent(new PriceEvent(price))) {
        	System.out.println("Event handled.");
        }else {
        	System.out.println("Event NOT handled.");
        }
    }

    public double getPrice() {
        return price;
    }
}
