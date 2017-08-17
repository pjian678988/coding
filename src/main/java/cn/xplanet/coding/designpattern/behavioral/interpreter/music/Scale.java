package cn.xplanet.coding.designpattern.behavioral.interpreter.music;

public class Scale extends Expression{

	@Override
	public void execute(NoteEnum key, double value) {
		String scale = "";
		switch((int)value){
		case 1:
			scale = "低音";
			break;
		case 2:
			scale = "中音";
			break;
		case 3:
			scale = "高音";
			break;
		}
		System.out.println(scale + " ");
	}

}
