package cn.xplanet.coding.designpattern.creational.factory;

public class DivFactory implements IFactory {

	@Override
	public Operation createFactory() {
		return new DivOperation();
	}

}
