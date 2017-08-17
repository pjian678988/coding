package cn.xplanet.coding.designpattern.structural.flyweight;

import java.util.HashMap;

public class WebsiteFactory {
	private HashMap<String,Website> flyweight = new HashMap<String,Website>();
	
	public Website getWebsiteCategory(String key){
		if(!flyweight.containsKey(key)){
			flyweight.put(key, new ConcreteWebsite(key));
		}
		return flyweight.get(key);
	}
	
	public int getWebsiteCount(){
		return flyweight.size();
	}
}
