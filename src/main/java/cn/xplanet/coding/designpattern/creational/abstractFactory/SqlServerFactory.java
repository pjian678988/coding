package cn.xplanet.coding.designpattern.creational.abstractFactory;

public class SqlServerFactory implements IFactory{

	@Override
	public IDepartment createDepartment() {
		return new SqlServerDepartment();
	}

	@Override
	public IUser createUser() {
		return new SqlServerUser();
	}

}
