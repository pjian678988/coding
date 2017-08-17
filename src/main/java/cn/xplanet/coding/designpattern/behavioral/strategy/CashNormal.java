package cn.xplanet.coding.designpattern.behavioral.strategy;

public class CashNormal extends CashSuper{

	@Override
	public double acceptCash(double money) {
		return money;
	}
	
}
