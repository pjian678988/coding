package cn.xplanet.coding.designpattern.creational.abstractFactory;

public interface IFactory {
	IUser createUser();
	IDepartment createDepartment();
}
