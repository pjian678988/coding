package cn.xplanet.coding.thread;

public class SynchronizedTest implements Runnable{
	
	private Integer amount = 0;

	/** 
	 * 描述该方法的功能及算法流程
	 *
	 * @autor: Administrator  2014-12-3 下午2:16:27
	 * @param args    
	 * @return void 
	 */
	public static void main(String[] args) {
		SynchronizedTest st = new SynchronizedTest();
		for(int i=0; i<20; i++){
			new Thread(st, "t"+i).start();
		}
	}
	
	public synchronized void add(){
		int tmp = amount;
		tmp += 10;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		amount = tmp;
	}
	
	public synchronized void minus(){
		int tmp = amount;
		tmp -= 10;
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		amount = tmp;
	}

	@Override
	public void run() {
		String currentThreadName = Thread.currentThread().getName();
		add();
		System.out.println(currentThreadName + "after add : " + amount);
		minus();
		System.out.println(currentThreadName + "after minus : " + amount);
	}
}
