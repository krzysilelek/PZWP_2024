package zad2;

public class Test {

    public static void main(String[] args) {
    	
    	experiment(false, false);
        experiment(true, false);
        
    }
    
    private static void experiment(boolean FlyweightMode, boolean expert) {
    	Runtime runtime = Runtime.getRuntime();
    	runtime.gc();
        long initialMemory = runtime.totalMemory() - runtime.freeMemory();
        FlyweightPool pool = null;
        
        if(FlyweightMode) {
        	 pool = FlyweightPool.getInstanceOf();
        }
        
    	Warehouse[] warehouses = new Warehouse[100];
        for (int i = 0; i < warehouses.length; i++) {
            warehouses[i] = new Warehouse();
            for (int j = 0; j < 20; j++) {
            	if(FlyweightMode) {
            		warehouses[i].addItem(pool.getArticle("art" + j, j));
            	}else {
            		warehouses[i].addItem(new Item("art" + j, j));
            	}
            }
        }
        
        if(expert) {
        	for (Warehouse m : warehouses) {
            	System.out.println(m.getItems());
            }
        }
        
        runtime.gc();
        long finalMemory = runtime.totalMemory() - runtime.freeMemory();
        long memoryUsed = finalMemory - initialMemory;
        
        if(FlyweightMode) {
        	System.out.println("Flyweight usage: " + memoryUsed + " bytes");
        }else {
        	System.out.println("Normal usage: " + memoryUsed + " bytes");
        }
    }
}
