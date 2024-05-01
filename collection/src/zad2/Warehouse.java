package zad2;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }
}
