package cn.xplanet.coding.designpattern.behavioral.observer;

/**
 * 观察者模式，又叫发布/订阅模式
 * @author bosshida
 * @date 2011-8-23
 */
public class Client {
	public static void main(String[] args) {
		Boss hu = new Boss();
		StockObserver tongshi1 = new StockObserver("老王",hu);
		NBAObserver tongshi2 = new NBAObserver("老子",hu);
		
		hu.attach(tongshi1);
		hu.attach(tongshi2);
		
		hu.setAction("老板我回来了");
		
		hu.notifyObserver();
	}
}
