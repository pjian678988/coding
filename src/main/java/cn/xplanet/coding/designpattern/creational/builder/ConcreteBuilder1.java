package cn.xplanet.coding.designpattern.creational.builder;

public class ConcreteBuilder1 extends Builder{
	private Product product = new Product();
	
	@Override
	public void buildPartA() {
		product.add("部件 1");
	}

	@Override
	public void buildPartB() {
		product.add("部件 2");
	}

	@Override
	public Product getResult() {
		return product;
	}

}
