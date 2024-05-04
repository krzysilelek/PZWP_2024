package zad2;

public class Test {

    public static void main(String[] args) {
    	
        experiment0();
        experiment1();
        
    }
    
    private static void experiment0() {
    	Runtime runtime = Runtime.getRuntime();
    	runtime.gc();
        long initialMemory = runtime.totalMemory() - runtime.freeMemory();
        
    	Warehouse[] warehouses = new Warehouse[100];
        for (int i = 0; i < warehouses.length; i++) {
            warehouses[i] = new Warehouse();
            for (int j = 0; j < 20; j++) {
                warehouses[i].addItem(new Item("art" + j, j));
            }
        }

        /*
        for (Warehouse m : warehouses) {
            for (Item a : m.getItems()) {
                System.out.println(a.getName() + " " + a.getPrice());
            }
        }
        */
        
        runtime.gc();
        long finalMemory = runtime.totalMemory() - runtime.freeMemory();
        long memoryUsed = finalMemory - initialMemory;

        System.out.println("Normal usage: " + memoryUsed + " bytes");
    }
    
    private static void experiment1() {
    	Runtime runtime = Runtime.getRuntime();
    	runtime.gc();
        long initialMemory = runtime.totalMemory() - runtime.freeMemory();
        
        FlyweightPool pool = FlyweightPool.getInstanceOf();
        
    	Warehouse[] warehouses = new Warehouse[100];
        for (int i = 0; i < warehouses.length; i++) {
            warehouses[i] = new Warehouse();
            for (int j = 0; j < 20; j++) {
                warehouses[i].addItem(pool.getArticle("art" + j, j));
            }
        }
        
        /*
        for (Warehouse m : warehouses) {
        	Item a = m.getItems().get(0);
        	Item b = m.getItems().get(1);
        	System.out.println(a+" "+m);
        	System.out.println(b+" "+m);
        	for (Item a : m.getItems()) {
                System.out.println(a+" "+m);
            }
        }
        */
        
        runtime.gc();
        long finalMemory = runtime.totalMemory() - runtime.freeMemory();
        long memoryUsed = finalMemory - initialMemory;

        System.out.println("Flyweight usage: " + memoryUsed + " bytes");
    }
}
