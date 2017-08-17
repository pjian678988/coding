package cn.xplanet.coding.designpattern.behavioral.command.bbq;

/**
 * bbq包里的类是书中以烤羊肉为背景的代码，为更好地理解此模式，就写出来了
 * 
 * @author bosshida
 * @date 2011-8-26
 */
public class Client {
	public static void main(String[] args) {
		Barbecuer boy = new Barbecuer();
		Command bakeMuttonCommand1 = new BakeMuttonCommand(boy);
		Command bakeMuttonCommand2 = new BakeMuttonCommand(boy);
		Command bakeChickenWingCommand1 = new BakeChickenWingCommand(boy);
		Waiter girl = new Waiter();
		
		girl.setOrder(bakeMuttonCommand1);
		girl.setOrder(bakeMuttonCommand2);
		girl.setOrder(bakeChickenWingCommand1);
		
		girl.cancelOrder(bakeMuttonCommand2);
		
		girl.notifyAllToExe();
		
	}
}
