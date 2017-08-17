package cn.xplanet.coding.designpattern.creational.factory;

public class MulOperation extends Operation{
	@Override
	public double getResult(){
		return getNumA() * getNumB();
	}
}
