package cn.xplanet.coding.designpattern.behavioral.state;

public class Work {
	private State state;
	private double hour;
	private boolean finish = false;
	
	public Work(){
		state = new ForenoonState();
	}
	
	public void setState(State s){
		state = s;
	}
	
	public void writeProgram(){
		state.writeProgram(this);
	}
	
	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}
}
