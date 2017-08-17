package cn.xplanet.coding.designpattern.structural.flyweight;

/**
 * 享元模式
 * @author bosshida
 * @date 2011-8-27
 */
public class Cient {
	public static void main(String[] args) {
		WebsiteFactory f = new WebsiteFactory();
		
		Website fx = f.getWebsiteCategory("产品展示");
		fx.use(new User("小菜"));
		
		Website fy = f.getWebsiteCategory("产品展示");
		fy.use(new User("大鸟"));
		
		Website fz = f.getWebsiteCategory("产品展示");
		fz.use(new User("娇娇"));
		
		Website ba = f.getWebsiteCategory("博客");
		ba.use(new User("iteye"));
		
		Website bb = f.getWebsiteCategory("博客");
		bb.use(new User("csdn"));
		
		Website bc = f.getWebsiteCategory("博客");
		bc.use(new User("blogbus"));
	}
}
