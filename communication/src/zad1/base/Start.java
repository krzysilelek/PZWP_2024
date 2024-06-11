package zad1.base;

public class Start {

    public static void main(String[] args) {
        new Start();
    }

    public Start() {
        Auction auction = new Auction(10);
        Client k1 = new Client("Adam", 40);
        Client k2 = new Client("Olek", 30);

        for (int i = 0; i < 200; i += 10) {
            auction.setPrice(i);
        }
    }
}