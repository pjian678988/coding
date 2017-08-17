package cn.xplanet.coding.designpattern.behavioral.command;

/**
 * 命令模式
 * @author bosshida
 * @date 2011-8-26
 */
public class Client {
	public static void main(String[] args) {
		Receiver r = new Receiver();
		Command c = new ConcreteCommand(r);
		Invoker i = new Invoker();
		
		i.setCommand(c);
		i.executeCommand();
	}
}
