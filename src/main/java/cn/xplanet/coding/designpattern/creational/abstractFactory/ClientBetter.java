package cn.xplanet.coding.designpattern.creational.abstractFactory;

/**
 * 抽象工厂模式，用反射+配置文件
 * 
 * @author bosshida
 * @date 2011-8-24
 */
public class ClientBetter {
	public static void main(String[] args) {
		String user = "bosshida";
		String department = "it";
		
		IUser iu = DataAccess.createUser();
		iu.insert(user);
		iu.getUser(1);
		
		IDepartment id = DataAccess.createDepartment();
		id.insert(department);
		id.getDepartment(2);
	}
}
