package cn.xplanet.coding.designpattern.structural.composite;

public abstract class Component {
	protected String name;

	public Component(String name){
		this.name = name;
	}
	
	//add remove是用来增加或移除树叶树枝的功能
	public abstract void add(Component c);
	public abstract void remove(Component c);
	public abstract void display(int depth);
}
