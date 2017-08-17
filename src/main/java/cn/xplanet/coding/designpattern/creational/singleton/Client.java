package cn.xplanet.coding.designpattern.creational.singleton;

/**
 * 单例模式
 * @author bosshida
 * @date 2011-8-26
 */
public class Client {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2){
			System.out.println("两个对象是相同的");
		}
	}
}
