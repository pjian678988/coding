package cn.xplanet.coding.designpattern.creational.builder;

/**
 * 建造者模式
 * @author bosshida
 * @date 2011-8-23
 */
public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		Builder b1 = new ConcreteBuilder1();
		Builder b2 = new ConcreteBuilder2();
		
		director.construct(b1);
		Product p1 = b1.getResult();
		p1.show();
		
		director.construct(b2);
		Product p2 = b2.getResult();
		p2.show();
	} 
}
