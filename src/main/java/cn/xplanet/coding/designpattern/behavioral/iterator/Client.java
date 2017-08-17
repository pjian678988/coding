package cn.xplanet.coding.designpattern.behavioral.iterator;

/**
 * 迭代器模式
 * 
 * @author bosshida
 * @date 2011-8-26
 */
public class Client {
	public static void main(String[] args) {
		ConcreteAggregate a = new ConcreteAggregate();
		a.addItem("aaa");
		a.addItem("bbb");
		a.addItem( "ccc");
		a.addItem( "ddd");
		a.addItem( "eee");
		
		Iterator i = new ConcreteIterator(a);
		Object item = i.first();
		System.out.println("first:" + item);
		while(!i.isDone()){
			System.out.println(i.currentItem());
			i.next();
		}
	}
}
