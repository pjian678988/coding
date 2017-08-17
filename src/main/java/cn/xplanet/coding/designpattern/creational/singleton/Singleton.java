package cn.xplanet.coding.designpattern.creational.singleton;

/**
 * 非多线程情况下的单例
 * @author bosshida
 * @date 2011-8-26
 */
public class Singleton {
	private static Singleton instance;
	
	private Singleton(){
	}
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
}
