package cn.xplanet.coding.designpattern.behavioral.responsibility;

//经理
public class CommonManager extends Manager {

	public CommonManager(String name) {
		super(name);
	}

	@Override
	public void requestApplication(Request request) {
		if(request.getRequestType().equals("请假") && request.getNumber() <= 2){
			System.out.printf("%s:%s 天数：%d 被批准\n", name,
					request.getRequestContent(), request.getNumber());
		}else if(superior != null){
			superior.requestApplication(request);
		}
	}

}
