package pl.kurs.zad3.liczydlo;

import java.util.ArrayList;
import java.util.List;

public class LiczydloPool {
	private volatile static LiczydloPool INSTANCE;
	private static final int MAX_POOL_SIZE = 2;
	private volatile List<Liczydlo> pool = new ArrayList<>();
	
	private LiczydloPool() {
		for(int i = 0; i < MAX_POOL_SIZE; i++) {
			pool.add(new Liczydlo());
		}
	}
	
	public static LiczydloPool getInstance() {
		if(INSTANCE == null) {
			synchronized(LiczydloPool.class) {
				if(INSTANCE==null) {
					INSTANCE = new LiczydloPool();
				}
			}
		}
		return INSTANCE;
	}
	
	public Liczydlo accquire() {
		if(pool.isEmpty()) {
			return null;
		}else {
			Liczydlo obj = pool.remove(pool.size() - 1);
			return obj;
		}
	}
	
	public void free(Liczydlo obj) {
		if(pool.size() < MAX_POOL_SIZE) {
			pool.add(obj);
		}
	}
}
