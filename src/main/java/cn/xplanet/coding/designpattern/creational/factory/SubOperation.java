package cn.xplanet.coding.designpattern.creational.factory;

public class SubOperation extends Operation{
	@Override
	public double getResult(){
		return getNumA() - getNumB();
	}
}
