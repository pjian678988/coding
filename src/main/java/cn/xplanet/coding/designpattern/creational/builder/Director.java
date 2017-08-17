package cn.xplanet.coding.designpattern.creational.builder;

public class Director {
	//用来指挥构建过程
	public void construct(Builder builder){
		builder.buildPartA();
		builder.buildPartB();
	}
}
