package cn.xplanet.coding.designpattern.behavioral.command.bbq;

public class BakeChickenWingCommand extends Command{

	public BakeChickenWingCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void executeCommand() {
		receiver.bakeChickenWing();
	}

	@Override
	public String getName() {
		return "烤鸡翅";
	}

}
