package cn.xplanet.coding.designpattern.structural.adapter;

/**
 * 相当于适配器模式里的Adapter
 * @author bosshida
 * @date 2011-8-25
 */
public class Translator extends Player {
	private ForeignCenter alienPlayer = new ForeignCenter();

	public Translator(String name) {
		super(name);
		alienPlayer.setName(name);
	}

	@Override
	public void attack() {
		alienPlayer.jinGong();
	}

	@Override
	public void defend() {
		alienPlayer.fangShou();
	}

}
