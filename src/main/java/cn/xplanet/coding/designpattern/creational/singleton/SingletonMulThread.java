package cn.xplanet.coding.designpattern.creational.singleton;

/**
 * 多线程时的单例
 * @author bosshida
 * @date 2011-8-26
 */
public class SingletonMulThread {
	private static SingletonMulThread instance;
	private static final Object lock = new Object();
	
	private SingletonMulThread(){
	}
	
	//双重锁定
	public static SingletonMulThread getInstance(){
		if(instance == null){
			synchronized(lock){
				if(instance == null){
					instance = new SingletonMulThread();
				}
			}
		}
		return instance;
	}
}
