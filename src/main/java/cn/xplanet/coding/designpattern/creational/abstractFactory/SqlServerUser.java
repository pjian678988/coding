package cn.xplanet.coding.designpattern.creational.abstractFactory;

public class SqlServerUser implements IUser {

	@Override
	public IUser getUser(int id) {
		System.out.println("在sql server中查出id为" + id + "的User记录");
		return null;
	}

	@Override
	public void insert(String user) {
		System.out.println("在sql server中插入user:" + user);
	}

}
