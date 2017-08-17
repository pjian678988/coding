package cn.xplanet.coding.designpattern.structural.proxy;

public class Client {
	public static void main(String[] args) {
		SchoolGirl jiaojiao = new SchoolGirl("jiaojiao");
		Proxy daili = new Proxy(jiaojiao);
		
		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();
	}
}
