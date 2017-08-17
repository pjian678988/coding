package cn.xplanet.coding.designpattern.creational.abstractFactory;

public class SqlServerDepartment implements IDepartment{

	@Override
	public IDepartment getDepartment(int id) {
		System.out.println("在sql server中查出id为" + id + "的Department记录");
		return null;
	}

	@Override
	public void insert(String department) {
		System.out.println("在sql server中插入department:" + department);
	}

}
