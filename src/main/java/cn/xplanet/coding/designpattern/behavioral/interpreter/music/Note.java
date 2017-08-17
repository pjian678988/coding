package cn.xplanet.coding.designpattern.behavioral.interpreter.music;

public class Note extends Expression {

	@Override
	public void execute(NoteEnum key, double value) {
		if(key == null){
			return;
		}
		String note = "";
		switch (key) {
		case NoteC:
			note = "1";
			break;
		case NoteD:
			note = "2";
			break;
		case NoteE:
			note = "3";
			break;
		case NoteF:
			note = "4";
			break;
		case NoteG:
			note = "5";
			break;
		case NoteA:
			note = "6";
			break;
		case NoteB:
			note = "7";
			break;
		case NoteO:
			break;
		case NoteP:
			break;
		default:
			break;
		}
		System.out.println(note + " ");
	}
}
