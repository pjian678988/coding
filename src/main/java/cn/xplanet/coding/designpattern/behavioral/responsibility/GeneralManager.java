package cn.xplanet.coding.designpattern.behavioral.responsibility;

//总经理
public class GeneralManager extends Manager {

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void requestApplication(Request request) {
		if (request.getRequestType() == "请假") {
			System.out.printf("%s:%s 天数：%d 被批准\n", name, request
					.getRequestContent(), request.getNumber());
		} else if (request.getRequestType().equals("加薪")
				&& request.getNumber() <= 500) {
			System.out.printf("%s:%s 数量：%d 被批准\n", name, request
					.getRequestContent(), request.getNumber());
		}else if (request.getRequestType().equals("加薪")
				&& request.getNumber() > 500) {
			System.out.printf("%s:%s 数量：%d 再考虑一下\n", name, request
					.getRequestContent(), request.getNumber());
		}
	}

}
