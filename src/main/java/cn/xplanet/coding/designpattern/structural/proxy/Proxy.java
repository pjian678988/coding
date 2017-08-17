package cn.xplanet.coding.designpattern.structural.proxy;

public class Proxy implements IGiveDolls{
	private Pursuit gg;
	
	public Proxy(SchoolGirl mm){
		this.gg = new Pursuit(mm);
	}
	
	@Override
	public void giveDolls() {
		gg.giveDolls();
	}

	@Override
	public void giveFlowers() {
		gg.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		gg.giveChocolate();
	}

}
