package cn.xplanet.coding.designpattern.structural.adapter;

public class Forwards extends Player{

	public Forwards(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("前锋 " + name + " 进攻");
	}

	@Override
	public void defend() {
		System.out.println("前锋 " + name + " 防守");
	}

}
