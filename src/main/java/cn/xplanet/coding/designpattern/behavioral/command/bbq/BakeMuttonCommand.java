package cn.xplanet.coding.designpattern.behavioral.command.bbq;

public class BakeMuttonCommand extends Command{

	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void executeCommand() {
		receiver.bakeMutton();
	}

	@Override
	public String getName() {
		return "烤羊肉";
	}

}
