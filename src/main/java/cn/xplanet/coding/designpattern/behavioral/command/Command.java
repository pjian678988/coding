package cn.xplanet.coding.designpattern.behavioral.command;

/**
 * 用来声明执行操作的接口
 * @author bosshida
 * @date 2011-8-26
 */
public abstract class Command {
	protected Receiver receiver;
	
	public Command(Receiver receiver){
		this.receiver = receiver;
	}
	
	public abstract void execute();
}
