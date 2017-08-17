package cn.xplanet.coding.designpattern.creational.factory;

public class AddOperation extends Operation{
	@Override
	public double getResult(){
		return getNumA() + getNumB();
	}
}
