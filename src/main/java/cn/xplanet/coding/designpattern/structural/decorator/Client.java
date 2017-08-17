package cn.xplanet.coding.designpattern.structural.decorator;

/**
 * 装饰模式
 * @author bosshida
 * @date 2011-8-18
 */
public class Client {
	public static void main(String[] args) {
		Person person = new Person("小菜");
		Sneakers shoes = new Sneakers();
		BigTrouser pant = new BigTrouser();
		TShirts shirt = new TShirts();
		
		shoes.decorate(person);
		pant.decorate(shoes);
		shirt.decorate(pant);
		shirt.show();
	}
}
