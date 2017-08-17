package cn.xplanet.coding.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
	private List<Component> children = new ArrayList<Component>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component c) {
		children.add(c);
	}
	
	@Override
	public void remove(Component c) {
		children.remove(c);
	}

	@Override
	public void display(int depth) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < depth; i++) {
			sb.append("-");
		}
		System.out.println(sb.toString() + name);
		
		for (Component c : children) {
			c.display(depth + 2);
		}
	}

}
