package cn.xplanet.coding.thread;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * ThreadLocal为每一个线程都提供了变量的副本，使得每个线程在某一时间访问到的并不是同一个对象，这样就隔离了多个线程对数据的数据共享
 * hibernate getSession()中应用到
 * @author pjian
 */
public class ThreadLocalTest implements Runnable{
	
	private static final ThreadLocal<Map<String, String>> context = new ThreadLocal<>();
	
	Map<String, String> getStringMap(){
		Map<String, String> stringMap = context.get();
		if(stringMap == null){
			stringMap = new HashMap<String, String>();
			context.set(stringMap);
		}
		return stringMap;
	}

	/** 
	 * 描述该方法的功能及算法流程
	 *
	 * @autor: Administrator  2014-12-3 下午1:40:43
	 * @param args    
	 * @return void 
	 */
	public static void main(String[] args) {
		ThreadLocalTest tl = new ThreadLocalTest();
		Thread t1 = new Thread(tl, "t1");
		Thread t2 = new Thread(tl, "t2");
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		String currentThreadName = Thread.currentThread().getName();
		System.out.println(currentThreadName + " is running!");
		Map<String, String> stringMap = getStringMap();
		stringMap.put("name", currentThreadName);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(currentThreadName + "*" + stringMap.get("name"));
	}

}
