package cn.xplanet.coding.designpattern.creational.singleton;

/**
 * 可以解决并发的问题
 * 弊端：如果在构造函数中抛出异常，实例将永远得不到创建
 */
public class Singleton2 {
	private static Singleton2 instance = new Singleton2();
	
	private Singleton2(){
	}
	
	public static Singleton2 getInstance(){
		return instance;
	}
}
