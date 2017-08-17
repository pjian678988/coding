package cn.xplanet.coding.designpattern.creational.factory;

public class AddFactory implements IFactory{

	@Override
	public Operation createFactory() {
		return new AddOperation();
	}

}
