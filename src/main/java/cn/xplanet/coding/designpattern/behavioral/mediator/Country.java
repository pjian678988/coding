package cn.xplanet.coding.designpattern.behavioral.mediator;

public abstract class Country {
	protected UnitedNations mediator;
	
	public Country(UnitedNations mediator){
		this.mediator = mediator;
	}
}
