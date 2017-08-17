package cn.xplanet.coding.designpattern.creational.simpleFactory;

public class OperationFactory {
	public static Operation createOperation(OperationCode operate) {
		switch (operate) {
		case Add:
			return new AddOperation();
		case Sub:
			return new SubOperation();
		case Mul:
			return new MulOperation();
		case Div:
			return new DivOperation();
		default:
			return null;
		}
	}
}
