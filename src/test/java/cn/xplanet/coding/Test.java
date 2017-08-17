package cn.xplanet.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test {

	/** 
	 */
	public static void main(String[] args) {
		List<Double> list = new ArrayList<Double>();
		list.add(1d);
		list.add(2d);
		list.add(3d);
		for(Double d : list){
			System.out.println(d);
//			list.remove(d); // java.util.ConcurrentModificationException
		}
		Double j = 0d;
		for(Iterator<Double> i = list.iterator(); i.hasNext();){
			j = i.next();
			System.out.println(j);
			if(j == 3){
				i.remove();
			}
		}
		for(Double d : list){
			System.out.println(d);
		}
		String s = "";
		System.out.println(s == "");
	}

}
