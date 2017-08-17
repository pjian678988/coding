package cn.xplanet.coding.designpattern.structural.bridge;

public abstract class HandsetBrand{
	protected HandsetSoft soft;
	
	public void setHandsetSoft(HandsetSoft soft){
		this.soft = soft;
	}
	
	public abstract void run();
}
