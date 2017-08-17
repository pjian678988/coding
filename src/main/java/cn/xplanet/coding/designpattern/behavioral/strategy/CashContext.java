package cn.xplanet.coding.designpattern.behavioral.strategy;

public class CashContext {
	private CashSuper cs;

	public CashContext(CashStrategyCode code) {
		switch (code) {  //实例化具体策略的过程由Context控制，简单工厂的应用
		case normal:
			this.cs = new CashNormal();
			break;
		case rebate:
			this.cs = new CashRebate(0.8d);
			break;
		case cReturn:
			this.cs = new CashReturn(300,100);
			break;
		}
	}

	public double getResult(double money){
		return cs.acceptCash(money);
	}
}
