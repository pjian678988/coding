package cn.xplanet.coding.algorithm;

public class BasicBitCalculate {
	
	/**
	 * 是否是2的倍数，位运算方法。另常见方法是求余
	 */
	public static boolean isPowerOfTwo(int x){
		return (x & (x-1)) == 0;
	}

	/**
	 * 交换两个数
	 * @param x
	 * @param y
	 */
	public static void swap(int x, int y){
		x = x ^ y ^ (y = x);
		System.out.println("x = " + x + "; y = " + y);
	}
	public static void swap2(int x, int y){
		x ^= y; y ^= x; x ^= y;
		System.out.println("x = " + x + "; y = " + y);
	}

	/**
	 * 描述该方法的功能及算法流程
	 *
	 * @autor: Administrator  2015-3-11 下午2:29:20
	 * @param args    
	 * @return void 
	 */
	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(8));
		swap(3, 4);
		swap2(3, 4);
	}

}
