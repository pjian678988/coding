// Serializable singleton with public final field - Page 18
package cn.xplanet.coding.effectivejava.chapter02.item03.serializable;

public class Elvis {
	public static final Elvis INSTANCE = new Elvis();

	private Elvis() {
		// take care of reflection -- AccessibleObject.setAccessible
		if (INSTANCE != null) {  
            throw new IllegalStateException("单例类不能创建第二个实例");
        }  
	}

	public void leaveTheBuilding() {
		System.out.println("Whoa baby, I'm outta here!");
	}

	private Object readResolve() {
		// Return the one true Elvis and let the garbage collector
		// take care of the Elvis impersonator.
		return INSTANCE;
	}

	// This code would normally appear outside the class!
	public static void main(String[] args) {
		Elvis elvis = Elvis.INSTANCE;
		elvis.leaveTheBuilding();
	}
}
