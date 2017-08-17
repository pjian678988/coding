package cn.xplanet.coding.designpattern.creational.abstractFactory;

import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * 为反射+配置文件而新增的数据访问类
 * 
 * @author bosshida
 * @date 2011-8-24
 */
public class DataAccess {
	private static String locatePackage = "cn.xplanet.coding.designpattern.abstractFactory.";
	private static String db = getDbFromXml(); // db可以为"Mysql"或"SqlServer"

	public static IUser createUser() {
		try {
			Class<?> userClass = Class.forName(locatePackage + db + "User");
			return (IUser) userClass.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static IDepartment createDepartment() {
		try {
			Class<?> departmentClass = Class.forName(locatePackage + db
					+ "Department");
			return (IDepartment) departmentClass.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 这里解析xml，采用jdk自带的dom方法，还有很多方法更好，例如：sax，jdom
	 * @return
	 */
	public static String getDbFromXml() {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder docBuilder = dbf.newDocumentBuilder();
			// ApplicationContext context = new FileSystemXmlApplicationContext(
			// "resource/applicationContext.xml");
			// XmlBeanFactory factory = new XmlBeanFactory(new
			// ClassPathResource(
			// "applicationContext.xml"));
			/** 为了简单示范，此处写成绝对路径，如果采用上面几行注释的方法，则更灵活，但需要另外的包 */
			InputStream inputStream = new FileInputStream(
					"E:/javaProject/DaHuaDesignPattern/src/chow/dahua/dp/abstractFactory/dbConfig.xml" );
			Document doc = docBuilder.parse(inputStream);
			Element root = doc.getDocumentElement();
			NodeList nodeList = root.getChildNodes();

			for (int i = 0; i < nodeList.getLength(); i++) {
				Node node = nodeList.item(i);
				if (node.getNodeName().equals("db")) {
					String value = node.getAttributes().getNamedItem("value").getTextContent();
					System.out.println("get from config: db=" + value);
					return value;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
