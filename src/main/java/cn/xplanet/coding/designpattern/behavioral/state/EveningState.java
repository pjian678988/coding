package cn.xplanet.coding.designpattern.behavioral.state;

public class EveningState extends State {

	@Override
	public void writeProgram(Work w) {
		if(w.isFinish()){
			w.setState(new RestState());
			w.writeProgram();
		}else{
			if(w.getHour() < 21){
				System.out.println("当前时间：" + w.getHour() + ",加班哦，疲惫之极");
			}else{
				w.setState(new SleepState());
				w.writeProgram();
			}
		}
	}

}
