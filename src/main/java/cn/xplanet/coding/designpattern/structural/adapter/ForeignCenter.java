package cn.xplanet.coding.designpattern.structural.adapter;

/**
 * 相当于适配器模式里的Adaptee
 * @author bosshida
 * @date 2011-8-25
 */
public class ForeignCenter {
	private String name;
	
	public void jinGong(){
		System.out.println("外籍前锋 " + name + " 进攻");
	}
	
	public void fangShou(){
		System.out.println("外籍前锋 " + name + " 进攻");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
