package cn.xplanet.coding.interview;

import java.util.ArrayList;

/**
 * Created by eloancn on 2017/9/7.
 */
public class TypeErasure {
	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<Integer>();
		ArrayList<Float> lf = new ArrayList<Float>();
		if (li.getClass() == lf.getClass()) // evaluates to true
			System.out.println("Equal");
	}
}
