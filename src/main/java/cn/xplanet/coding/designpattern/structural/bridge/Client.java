package cn.xplanet.coding.designpattern.structural.bridge;

/**
 * 桥接模式
 * @author bosshida
 * @date 2011-8-26
 */
public class Client {
	public static void main(String[] args) {
		HandsetBrand ab;
		//nokia
		ab = new HandsetBrandNokia();
		
		ab.setHandsetSoft(new HandsetGame());
		ab.run();
		
		ab.setHandsetSoft(new HandsetAddressList());
		ab.run();
		
		//motor
		ab = new HandsetBrandMotor();
		
		ab.setHandsetSoft(new HandsetGame());
		ab.run();
		
		ab.setHandsetSoft(new HandsetAddressList());
		ab.run();
	}
}
