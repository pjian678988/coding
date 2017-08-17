package cn.xplanet.coding.designpattern.creational.abstractFactory;

/**
 * 抽象工厂模式
 * @author bosshida
 * @date 2011-8-24
 */
public class Client {
	public static void main(String[] args) {
		String user = "bosshida";
		String department = "it";
		
		IFactory factory = new SqlServerFactory();
//		IFactory factory = new MysqlFactory();
		IUser iu = factory.createUser();
		iu.insert(user);
		iu.getUser(1);
		
		IDepartment id = factory.createDepartment();
		id.insert(department);
		id.getDepartment(2);
	}
}
