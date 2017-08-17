package cn.xplanet.coding.designpattern.behavioral.responsibility;

public class Request {
	private String requestType;
	private String requestContent;
	private int number;
	
	public Request(){}
	
	public Request(String type,String content,int number){
		this.requestType = type;
		this.requestContent = content;
		this.number = number;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public String getRequestContent() {
		return requestContent;
	}

	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}
