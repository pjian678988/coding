package cn.xplanet.coding.designpattern.creational.prototype;

import java.io.IOException;

/**
 * 原型模式，以简历复印为背景
 * @author bosshida
 * @date 2011-8-22
 */
public class Client {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Resume re = new Resume("小菜");
		re.setPersonInfo("男", 24);
		re.setWorkExperience("2011-9-8", "aaaa");
		re.display();
	
		Resume re3 = (Resume) re.deepClone();
		re3.setPersonInfo("男", 28);
		re3.setWorkExperience("2013-3-4", "bbbbbb");
		re3.display();
		
		Resume re4 = (Resume) re.deepCloneSerial();
		re4.setPersonInfo("男", 29);
		re4.setWorkExperience("2014-3-4", "bbbbbb");
		re4.display();
		
		Resume re2 = (Resume) re.clone();
		re2.setWorkExperience("2010-3-4", "bbbbbb");
		re2.display();
		re.display();
		
		
	}
}
