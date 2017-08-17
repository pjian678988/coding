package cn.xplanet.coding.designpattern.structural.adapter;

/**
 * 适配式模式
 * @author bosshida
 * @date 2011-8-25
 */
public class Client {
	public static void main(String[] args) {
		Player b = new Forwards("巴蒂尔");
		b.attack();
		
		Player m = new Guards("麦迪");
		m.attack();
		
		Player ym = new Translator("姚明");
		ym.attack();
		ym.defend();
		
	}
}
