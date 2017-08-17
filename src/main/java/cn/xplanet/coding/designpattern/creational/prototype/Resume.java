package cn.xplanet.coding.designpattern.creational.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Resume implements Cloneable, Serializable{
	private static final long serialVersionUID = 438445188057445445L;
	private String name;
	private String sex;
	private int age;
	private WorkExperience work;
	
	public Resume(String name){
		this.name = name;
		work = new WorkExperience();
	}
	
	private Resume(WorkExperience work){
		this.work = work;
	}
	
	public void setPersonInfo(String sex,int age){
		this.sex = sex;
		this.age = age;
	}
	
	public void setWorkExperience(String workDate,String company){
		work.setWorkDate(workDate);
		work.setCompany(company);
	}
	
	public void setWork(WorkExperience work){
		this.work = work;
	}
	
	public void display(){
		System.out.println(name + " " + sex + " " + age);
		System.out.println("工作经历：" + work.getWorkDate() + " " + work.getCompany());
	}
	
	/**
	 * 浅复制
	 */
	public Object clone(){
		Resume obj = new Resume(this.work);
		obj.name = this.name;
		obj.sex = this.sex;
		obj.age = this.age;
		return obj;
	}
	
	/**
	 * 深复制-属性对象再clone
	 */
	public Object deepClone(){
		Resume obj = new Resume((WorkExperience)this.work.clone());
		obj.name = this.name;
		obj.sex = this.sex;
		obj.age = this.age;
		return obj;
	}
	
	/**
	 *	深复制-序列化
	 */
	public Object deepCloneSerial() throws IOException, ClassNotFoundException{
		// 将对象写到流里
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        ObjectOutputStream oo = new ObjectOutputStream(bo);
        oo.writeObject(this);
        // 从流里读出来
        ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi = new ObjectInputStream(bi);
        return (oi.readObject());
	}
}
