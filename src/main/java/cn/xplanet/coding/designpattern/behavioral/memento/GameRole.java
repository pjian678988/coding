package cn.xplanet.coding.designpattern.behavioral.memento;

public class GameRole {
	private int vit;
	private int atk;
	private int def;
	
	public void stateDisplay(){
		System.out.println("当前角色状态：");
		System.out.printf("体力：%d，攻击力：%d，防御力：%d\n",vit,atk,def);
	}
	
	public void getInitState(){
		this.vit = 100;
		this.atk = 100;
		this.def = 100;
	}
	
	public void fight(){
		this.vit = 0;
		this.atk = 0;
		this.def = 0;
	}
	
	public RoleStateMemento saveState(){
		return new RoleStateMemento(vit,atk,def);
	}
	
	public void recoverState(RoleStateMemento memento){
		this.vit = memento.getVit();
		this.atk = memento.getAtk();
		this.def = memento.getDef();
	}
	
	public int getVit() {
		return vit;
	}
	public void setVit(int vit) {
		this.vit = vit;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	
	
}
