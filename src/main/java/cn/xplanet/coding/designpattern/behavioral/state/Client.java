package cn.xplanet.coding.designpattern.behavioral.state;

/**
 * 状态模式
 * 
 * @author bosshida
 * @date 2011-8-24
 */
public class Client {
	public static void main(String[] args) {
		Work project = new Work();
		
		project.setHour(9);
		project.writeProgram();
	
		project.setHour(10);
		project.writeProgram();
		
		project.setHour(12);
		project.writeProgram();
		
		project.setHour(13);
		project.writeProgram();
		
		project.setHour(14);
		project.writeProgram();
		
		project.setHour(17);
		project.writeProgram();
		
		project.setFinish(false); //or false
		project.writeProgram();
		
		project.setHour(19);
		project.writeProgram();
		
		project.setHour(22);
		project.writeProgram();
	}
}
