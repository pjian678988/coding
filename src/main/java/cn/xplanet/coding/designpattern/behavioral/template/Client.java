package cn.xplanet.coding.designpattern.behavioral.template;

/**
 * 模板方法模式，以选择题为背景
 * @author bosshida
 * @date 2011-8-23
 */
public class Client {
	public static void main(String[] args) {
		System.out.println("A的答案");
		TestPaper stuA = new TestPaperA();
		stuA.testQuestion1();
		stuA.testQuestion2();
		
		System.out.println("B的答案");
		TestPaper stuB = new TestPaperB();
		stuB.testQuestion1();
		stuB.testQuestion2();
	}
}
