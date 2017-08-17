package cn.xplanet.coding.designpattern.creational.factory;

public class MulFactory implements IFactory {

	@Override
	public Operation createFactory() {
		return new MulOperation();
	}

}
