package cn.xplanet.coding.designpattern.behavioral.observer;

public class NBAObserver extends Observer{

	public NBAObserver(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	public void update() {
		System.out.println(sub.getAction() + " " + name + "关闭NBA直播，继续工作");
	}

}
