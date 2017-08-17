package cn.xplanet.coding.designpattern.creational.singleton;

/**
 * synchronized加到方法上
 */
public class SingletonMulThread2 {
	private static SingletonMulThread2 instance;
	
	private SingletonMulThread2(){
	}
	
	// 构造时加锁
	private static synchronized void syncInit(){
		if(instance == null){
			instance = new SingletonMulThread2();
		}
	}
	
	public static SingletonMulThread2 getInstance(){
		if(instance == null){
			syncInit();
		}
		return instance;
	}
}
