package cn.xplanet.coding.designpattern.creational.factory;

/**
 * 工厂方法模式
 * 
 * @author bosshida
 * @date 2011-8-22
 */
public class Client {
	public static void main(String[] args) {
		IFactory factory = new AddFactory();
		Operation oper = factory.createFactory();
		oper.setNumA(10.1d);
		oper.setNumB(2d);
		System.out.println(oper.getResult());
	}
}
