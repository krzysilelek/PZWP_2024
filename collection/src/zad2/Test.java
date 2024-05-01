package zad2;

public class Test {

    public static void main(String[] args) {

        Warehouse[] warehouses = new Warehouse[100];
        for (int i = 0; i < warehouses.length; i++) {
            warehouses[i] = new Warehouse();
            for (int j = 0; j < 20; j++) {
                warehouses[i].addItem(new Item("art" + j, j));
            }
        }

        for (Warehouse m : warehouses) {
            for (Item a : m.getItems()) {
                System.out.println(a.getName() + " " + a.getPrice());
            }
        }
    }
}
