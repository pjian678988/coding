package cn.xplanet.coding.designpattern.creational.simpleFactory;

public class MulOperation extends Operation{
	@Override
	public double getResult(){
		return getNumA() * getNumB();
	}
}
