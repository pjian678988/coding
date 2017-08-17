package cn.xplanet.coding.designpattern.creational.factory;

public class Operation {
	private double numA;
	private double numB;
	
	public double getResult(){
		return 0d;
	}
	
	public double getNumA() {
		return numA;
	}

	public void setNumA(double numA) {
		this.numA = numA;
	}

	public double getNumB() {
		return numB;
	}

	public void setNumB(double numB) {
		this.numB = numB;
	}

}
