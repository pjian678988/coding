package cn.xplanet.coding.designpattern.creational.abstractFactory;

public class MysqlFactory implements IFactory{

	@Override
	public IDepartment createDepartment() {
		return new MysqlDepartment();
	}

	@Override
	public IUser createUser() {
		return new MysqlUser();
	}

}
