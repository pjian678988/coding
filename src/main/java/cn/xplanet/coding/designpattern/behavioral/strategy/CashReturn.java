package cn.xplanet.coding.designpattern.behavioral.strategy;

//返利收费子类,例如满300返100
public class CashReturn extends CashSuper{
	private double moneyCondition = 0d;
	private double moneyReturn = 0d;
	
	public CashReturn(double condition, double moneyReturn){
		this.moneyCondition = condition;
		this.moneyReturn = moneyReturn;
	}

	@Override
	public double acceptCash(double money) {
		if(money >= moneyCondition){
			return money - Math.floor(money / moneyCondition) * moneyReturn;
		}
		return money;
	}
	
}
