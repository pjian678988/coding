package cn.xplanet.coding.designpattern.creational.factory;

public class DivOperation extends Operation {
	@Override
	public double getResult() {
		try {
			return getNumA() / getNumB();
		} catch (Exception e) {
			System.err.println("除数不能为0");
			e.printStackTrace();
		}
		return 0;
	}
}
