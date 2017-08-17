package cn.xplanet.coding.designpattern.behavioral.strategy;

import java.util.Scanner;

/**
 * 策略模式，以商场促销的收银系统为背景 要求用两个文本框输入单价和数量，<br>
 * 一个确定按钮来算出每种商品的费用，用一个列表框来记录商品的清单，<br>
 * 一个标签来记录总计，此程序只用终端来显示，无界面
 * 
 * @author bosshida
 * @date 2011-8-17
 */
public class Client {
	private String selectStrategy = "0";
	private String finish = "#";

	public static void main(String[] args) {
		Client client = new Client();
		client.run();
	}

	private void run() {
		double total = 0d;
		CashContext context = null;
		Scanner scanner = new Scanner(System.in);
		System.out.printf("商场收银系统模拟程序：输入%s结束程序，输入%s选择策略", finish,
				selectStrategy);
		String input = selectStrategy;
		while (!input.equals(finish)) {
			if (input.equals(selectStrategy)) {
				context = new CashContext(getStrategy(scanner));
				input = "";
			}
			System.out.println("请输入购买物品单价和数量，以空格隔开");
			input = scanner.nextLine();
			if (context != null && !input.equals(finish)) {
				total += context.getResult(getSell(input));
			}
		}
		System.out.println("总价格：" + total);
	}

	private double getSell(String line) {
		try {
			String[] array = line.split(" ");
			double price = Double.parseDouble(array[0]);
			double count = Double.parseDouble(array[1]);
			return price * count;
		} catch (Exception e) {
		}
		return 0d;
	}

	private CashStrategyCode getStrategy(Scanner scanner) {
		System.out.println("策略选择：\n1.正常；2.8折；3.满300返100");
		try {
			int num = Integer.parseInt(scanner.nextLine());
			switch (num) {
			case 1:
				return CashStrategyCode.normal;
			case 2:
				return CashStrategyCode.rebate;
			case 3:
				return CashStrategyCode.cReturn;
			}
		} catch (Exception e) {
			return null;
		}
		return null;
	}
}
