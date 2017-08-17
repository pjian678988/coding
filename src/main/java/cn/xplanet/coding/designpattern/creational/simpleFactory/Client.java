package cn.xplanet.coding.designpattern.creational.simpleFactory;

/**
 * 简单工厂模式，以实现计算器的功能为背景，
 * 把加减乘除等运算的生成操作交给OperationFactory控制
 * @author bosshida
 * @date 2011-8-17
 */
public class Client {
	public static void main(String[] args) {
		Operation oper;
		oper = OperationFactory.createOperation(OperationCode.Add);
		oper.setNumA(1);
		oper.setNumB(2);
		System.out.println(oper.getResult());
	}
}
