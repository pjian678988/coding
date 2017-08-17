package cn.xplanet.coding.designpattern.behavioral.command;

/**
 * 将一个接收者对象绑定于一个动作，调用接收者相应的操作，以实现execute
 * @author bosshida
 * @date 2011-8-26
 */
public class ConcreteCommand extends Command{

	public ConcreteCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {
		receiver.action();
	}

}
