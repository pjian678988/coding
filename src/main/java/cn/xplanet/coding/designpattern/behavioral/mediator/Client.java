package cn.xplanet.coding.designpattern.behavioral.mediator;

/**
 * 中介者模式
 * @author bosshida
 * @date 2011-8-27
 */
public class Client {
	public static void main(String[] args) {
		UnitedNationsSecurityCouncil unsc = new UnitedNationsSecurityCouncil();
		
		USA usa = new USA(unsc);
		Iraq iraq = new Iraq(unsc);
		
		unsc.setIraqColleague(iraq);
		unsc.setUsaColleague(usa);
		
		usa.declare("不准研制核武器，否则要发动战争");
		iraq.declare("我们没有核武器，也不怕侵略");
	}
}
