package cn.xplanet.coding.designpattern.behavioral.responsibility;

/**
 * 职责链模式
 * @author bosshida
 * @date 2011-8-27
 */
public class Client {
	public static void main(String[] args) {
		CommonManager jinli = new CommonManager("金利");
		Majordomo zongjian = new Majordomo("宗剑");
		GeneralManager zhongjinli = new GeneralManager("钟精力");
		jinli.setSuperior(zongjian);
		zongjian.setSuperior(zhongjinli);
		
		Request request = new Request("请假","小菜请假",1);
		jinli.requestApplication(request);
		
		Request request2 = new Request("请假","小菜请假",4);
		jinli.requestApplication(request2);
		
		Request request3 = new Request("加薪","小菜请求加薪",500);
		jinli.requestApplication(request3);
		
		Request request4 = new Request("加薪","小菜请求加薪",1000);
		jinli.requestApplication(request4);
	}
}
