package cn.xplanet.coding.designpattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Boss implements Subject{
	private List<Observer> observers = new ArrayList<Observer>();
	private String action;
	
	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		for(Observer obs : observers){
			obs.update();
		}
	}
	
	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}
}
