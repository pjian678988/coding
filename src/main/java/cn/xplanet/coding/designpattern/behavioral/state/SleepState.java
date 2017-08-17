package cn.xplanet.coding.designpattern.behavioral.state;

public class SleepState extends State {

	@Override
	public void writeProgram(Work w) {
		System.out.println("当前时间：" + w.getHour() + "，不行了，睡着了");
	}

}
