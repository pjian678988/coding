package cn.xplanet.coding.designpattern.behavioral.iterator;

import java.util.Iterator;

/**
 * 该类为Java的Iterator而写，在java中，所有的集合类（List,Set,Queue,Map）都实现了Iterable,<br>
 * 可以用for(type t : collection)来遍历。对于所有实现Iterable接口的类都可通过foreach语法遍历<br>
 * @author bosshida
 * @date 2011-8-26
 */
public class ClientForJavaIterator implements Iterable<String>{
	protected String[] words = "And that is how we know the Earth to be banana-shaped".split(" ");
	
	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>(){
			private int index = 0;
			
			@Override
			public boolean hasNext() {
				return index < words.length;
			}

			@Override
			public String next() {
				return words[index++];
			}

			//not implemented
			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
			
		};
	}
	
	public static void main(String[] args) {
		for(String ss : new ClientForJavaIterator()){
			System.out.println(ss);
		}
	}
	
}
