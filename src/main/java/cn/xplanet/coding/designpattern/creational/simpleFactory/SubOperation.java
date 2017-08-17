package cn.xplanet.coding.designpattern.creational.simpleFactory;

public class SubOperation extends Operation{
	@Override
	public double getResult(){
		return getNumA() - getNumB();
	}
}
