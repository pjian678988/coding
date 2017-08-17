package cn.xplanet.coding.designpattern.behavioral.memento;

/**
 * 备忘录模式
 * @author bosshida
 * @date 2011-8-25
 */
public class Client {
	public static void main(String[] args) {
		//大战boss前
		GameRole boy = new GameRole();
		boy.getInitState();
		boy.stateDisplay();
		
		//保存进度
		RoleStateCaretaker stateAdmin = new RoleStateCaretaker();
		stateAdmin.setMemento(boy.saveState());
		
		//大战boss时，损耗严重
		boy.fight();
		boy.stateDisplay();
		
		//恢复之前状态
		boy.recoverState(stateAdmin.getMemento());
		boy.stateDisplay();
	}
}
