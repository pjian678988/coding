package cn.xplanet.coding.designpattern.behavioral.strategy;

//打折收费子类
public class CashRebate extends CashSuper{
	private double moneyRebate = 1d;
	
	public CashRebate(double rate){
		this.moneyRebate = rate;
	}
	
	@Override
	public double acceptCash(double money) {
		return money * moneyRebate;
	}

}
