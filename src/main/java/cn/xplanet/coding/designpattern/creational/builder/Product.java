package cn.xplanet.coding.designpattern.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class Product {
	List<String> parts = new ArrayList<String>();
	
	public void add(String part){
		parts.add(part);
	}
	
	public void show(){
		System.out.println("\n产品创建:");
		for(String part : parts){
			System.out.print(part + " ");
		}
		System.out.println("\n-----------");
	}
}
