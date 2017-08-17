package cn.xplanet.coding.designpattern.behavioral.interpreter.music;

/**
 * 解释器模式
 * @author bosshida
 * @date 2011-8-28
 */
public class Client {
	public static void main(String[] args) {
		PlayContext context = new PlayContext();
		
		System.out.println("上海滩：");
		String poem = "O 2 E 0.5 G 0.5 A 3 ";
		context.setText(poem);
		Expression expr = null;
		
		try{
			while(context.getText().length() > 0){
				String str = context.getText().substring(0,1);
				if(str.equals("O")){
					expr = new Scale();
				}else{
					expr = new Note();
				}
				expr.interpret(context);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
