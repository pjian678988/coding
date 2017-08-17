package cn.xplanet.coding.designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate{
	private List<Object> items = new ArrayList<Object>();
	
	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}

	public int count(){
		return items.size();
	}
	
	public Object getItem(int index){
		return items.get(index);
	}
	
	public void addItem(Object value){
		items.add(value);
	}
}
