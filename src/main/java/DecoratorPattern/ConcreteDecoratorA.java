package DecoratorPattern;

/**
 * @Author: zcc
 * @Created_on: 2022/3/16/13:23
 * ./ConcreteDecoratorA.java
 */
public class ConcreteDecoratorA extends Decorator{
    private String addedState;

    @Override
    public void Operation() {
        super.Operation();
        addedState="New State";
        System.out.println("具体装饰对象A的操作");
    }
}
