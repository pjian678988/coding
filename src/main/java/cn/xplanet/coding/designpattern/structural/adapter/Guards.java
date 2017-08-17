package cn.xplanet.coding.designpattern.structural.adapter;

public class Guards extends Player {

	public Guards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("后卫 " + name + " 进攻");
	}

	@Override
	public void defend() {
		System.out.println("后卫 " + name + " 进攻");
	}

}
