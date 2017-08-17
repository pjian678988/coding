package cn.xplanet.coding.designpattern.behavioral.iterator;

public class ConcreteIterator extends Iterator{
	private ConcreteAggregate aggregate;
	private int current = 0;
	
	public ConcreteIterator(ConcreteAggregate aggregate){
		this.aggregate = aggregate;
	}
	
	@Override
	public Object currentItem() {
		return aggregate.getItem(current);
	}

	@Override
	public Object first() {
		return aggregate.getItem(0);
	}

	@Override
	public boolean isDone() {
		return current >= aggregate.count();
	}

	@Override
	public Object next() {
		return aggregate.getItem(current++);
	}

}
