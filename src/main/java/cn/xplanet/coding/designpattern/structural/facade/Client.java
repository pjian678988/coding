package cn.xplanet.coding.designpattern.structural.facade;

/**
 * 外观模式，以uml图为背景,由于Facade的作用，客户端可以根本不知三个子系统类的存在
 * @author bosshida
 * @date 2011-8-23
 */
public class Client {
	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.methodA();
		facade.methodB();
	}
}
