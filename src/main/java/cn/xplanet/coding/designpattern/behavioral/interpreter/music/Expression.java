package cn.xplanet.coding.designpattern.behavioral.interpreter.music;

public abstract class Expression {
	public void interpret(PlayContext context) {
		if (context.getText().length() == 0) {
			return;
		} else {
			String playKey = context.getText().substring(0, 1);
			NoteEnum key = switchKey(playKey);
			context.setText(context.getText().substring(2));
			double playValue = Double.parseDouble((String) context.getText().subSequence(0,context.getText().indexOf(" ")));
			context.setText(context.getText().substring(context.getText().indexOf(" ") + 1));
			execute(key,playValue);
		}
	}

	private NoteEnum switchKey(String playKey) {
		int keyNum = playKey.charAt(0) - 'A';
		switch (keyNum) {
		case 0:
			return NoteEnum.NoteA;
		case 1:
			return NoteEnum.NoteB;
		case 2:
			return NoteEnum.NoteC;
		case 3:
			return NoteEnum.NoteD;
		case 4:
			return NoteEnum.NoteE;
		case 5:
			return NoteEnum.NoteF;
		case 6:
			return NoteEnum.NoteG;
		case 'O'-'A':
			return NoteEnum.NoteO;
		case 'P'-'A':
			return NoteEnum.NoteP;
		}
		return null;
	}

	public abstract void execute(NoteEnum key, double value);
}
