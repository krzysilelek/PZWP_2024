package zad2;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class FlyweightPool {
	private volatile static FlyweightPool INSTANCE;
	private Map<String, WeakReference<Item>> articlesPool;
	
	private FlyweightPool() {
		articlesPool = new HashMap<String, WeakReference<Item>>();
	}
	
	public static FlyweightPool getInstanceOf() {
		if(INSTANCE==null)
			synchronized(FlyweightPool.class) {
			if(INSTANCE==null)
			INSTANCE = new FlyweightPool();
		}
		return INSTANCE;
	}
	
	public Item getArticle(String name, float price) {
		
		WeakReference<Item> ref = articlesPool.get(name);
		Item article = (ref != null) ? ref.get() : null;
		
		if (article == null) {
			article = new Item(name, price);
			articlesPool.put(name, new WeakReference<Item>(article));
			}
		
		return article;
	}
}
