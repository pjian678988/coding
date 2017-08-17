package cn.xplanet.coding.algorithm;

public class BasicBitCalculate {
	
	/**
	 * 是否是2的倍数，位运算方法。另常见方法是求余
	 */
	public static boolean isPowerOfTwo(int x){
		return (x & (x-1)) == 0;
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
	}

}
