package SimpleFactoryModel;

import SimpleFactoryModel.Calculator.Calculate;
import SimpleFactoryModel.Calculator.Operation;

public class OperationFactory {
    public static Operation createOperation(String operation) {
        return switch (operation) {
            case "+" -> new Calculate.OperationAdd();
            case "-" -> new Calculate.OperationSub();
            case "*" -> new Calculate.OperationMul();
            case "/" -> new Calculate.OperationDiv();
            default -> null;
        };
    }

    public static void main(String[] args) {
        Operation oper = OperationFactory.createOperation("*");
        oper.set_numberA(1);
        oper.set_numberB(2);
        System.out.println(oper.GetResult());
    }
}
