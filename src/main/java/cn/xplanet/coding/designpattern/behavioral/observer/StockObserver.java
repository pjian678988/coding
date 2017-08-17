package cn.xplanet.coding.designpattern.behavioral.observer;

public class StockObserver extends Observer{

	public StockObserver(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	public void update() {
		System.out.println(sub.getAction() + " " + name + "关闭股票软件，继续工作");
	}

	
}
