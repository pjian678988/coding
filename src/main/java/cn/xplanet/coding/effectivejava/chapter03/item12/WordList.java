package cn.xplanet.coding.effectivejava.chapter03.item12;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class WordList {
	public static void main(String[] args) {
		Set<String> s = new TreeSet<String>();
		Collections.addAll(s, args);
		System.out.println(s);
		
		/**
		 * <p>参见 @see {@code BigDecimal}
		 * <p> @see {@link java.math.BigDecimal#equals(Object)}
		 * objects equal only if they are equal in
	     * value and scale (thus 2.0 is not equal to 2.00 when compared by
	     * this method).
		 */
		// HashSet是通过equals方法来判断对象的相同性.
		Set<BigDecimal> b2 = new HashSet<BigDecimal>();
		// TreeSet是基于BigDecimal的compareTo方法是否返回0来判断对象的相等性
		Set<BigDecimal> b1 = new TreeSet<BigDecimal>();
		BigDecimal bd1 = new BigDecimal("1.0");
		BigDecimal bd2 = new BigDecimal("1.00");
		
		b1.add(bd1);
		b1.add(bd2);
		b2.add(bd1);
		b2.add(bd2);
		System.out.println(b1);
		System.out.println(b2);
	}
}

