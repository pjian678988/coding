package cn.xplanet.coding.designpattern.behavioral.template;

public abstract class TestPaper {
	public final void testQuestion1(){
		System.out.println("1+1=? a.1 b.2 c.3 d.4");
		System.out.println("答案：" + answer1());
	}
	
	public final void testQuestion2(){
		System.out.println("2+2=? a.2 b.3 c.4 d.6");
		System.out.println("答案：" + answer2());
	}

	protected abstract String answer1();
	protected abstract String answer2();
}
