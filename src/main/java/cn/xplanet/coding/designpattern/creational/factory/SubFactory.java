package cn.xplanet.coding.designpattern.creational.factory;

public class SubFactory implements IFactory{

	@Override
	public Operation createFactory() {
		return new SubOperation();
	}

}
