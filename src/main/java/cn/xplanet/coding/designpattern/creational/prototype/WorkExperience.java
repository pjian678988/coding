package cn.xplanet.coding.designpattern.creational.prototype;

import java.io.Serializable;

public class WorkExperience implements Cloneable, Serializable{
	private static final long serialVersionUID = -3114566671017527722L;
	private String workDate;
	private String company;
	
	public Object clone(){  //工作经历类实现的深克隆方法
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
}
