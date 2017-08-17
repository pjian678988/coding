package cn.xplanet.coding.designpattern.creational.abstractFactory;

public class MysqlUser implements IUser{

	@Override
	public IUser getUser(int id) {
		System.out.println("在mysql中查出id为" + id + "的User记录");
		return null;
	}

	@Override
	public void insert(String user) {
		System.out.println("在mysql中插入user:" + user);
	}

}
