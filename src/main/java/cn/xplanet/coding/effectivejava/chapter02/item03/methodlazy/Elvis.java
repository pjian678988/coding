// Singleton with static factory - Page 17
package cn.xplanet.coding.effectivejava.chapter02.item03.methodlazy;

public class Elvis {
	private static Elvis INSTANCE;
	private static final Object lock = new Object();

	private Elvis() {
		// take care of reflection -- AccessibleObject.setAccessible
		if (INSTANCE != null) {  
            throw new IllegalStateException("单例类不能创建第二个实例");
        }  
	}

	public static Elvis getInstance() {
		if(INSTANCE == null){
			synchronized (lock) {
				if (INSTANCE == null) {
					INSTANCE = new Elvis();
				}
			}
		}
		return INSTANCE;
	}

	public void leaveTheBuilding() {
		System.out.println("Whoa baby, I'm outta here!");
	}

	// This code would normally appear outside the class!
	public static void main(String[] args) {
		Elvis elvis = Elvis.getInstance();
		elvis.leaveTheBuilding();
	}
}
