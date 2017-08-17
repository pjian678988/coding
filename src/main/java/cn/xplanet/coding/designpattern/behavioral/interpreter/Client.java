package cn.xplanet.coding.designpattern.behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * 解释器模式
 * @author bosshida
 * @date 2011-8-29
 */
public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		List<AbstractExpression> list = new ArrayList<AbstractExpression>();
		list.add(new TerminalExpression());
		list.add(new NonterminalExpression());
		list.add(new TerminalExpression());
		list.add(new NonterminalExpression());
		
		for(AbstractExpression exp : list){
			exp.interpret(context);
		}
	}
}
