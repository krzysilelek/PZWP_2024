package zad2;

public class Item {

    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = new String(name);
        this.price = price;
    }

    public String getName() {
        return name.toString();
    }

    public double getPrice() {
        return price;
    }
}