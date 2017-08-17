// Noninstantiable utility class
package cn.xplanet.coding.effectivejava.chapter02.item04;

public class UtilityClass {
	// Suppress default constructor for noninstantiability
	private UtilityClass() {
		throw new AssertionError();
	}
}
