package cn.xplanet.coding.designpattern.creational.simpleFactory;

public class AddOperation extends Operation{
	@Override
	public double getResult(){
		return getNumA() + getNumB();
	}
}
