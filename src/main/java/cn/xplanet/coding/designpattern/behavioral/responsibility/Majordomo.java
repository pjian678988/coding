package cn.xplanet.coding.designpattern.behavioral.responsibility;

//总监
public class Majordomo extends Manager {

	public Majordomo(String name) {
		super(name);
	}

	@Override
	public void requestApplication(Request request) {
		if (request.getRequestType() == "请假" && request.getNumber() <= 5) {
			System.out.printf("%s:%s 天数：%d 被批准\n", name,
					request.getRequestContent(), request.getNumber());
		}else if(superior != null){
			superior.requestApplication(request);
		}
	}

}
