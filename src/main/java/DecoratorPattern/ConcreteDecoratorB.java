package DecoratorPattern;

/**
 * @Author: zcc
 * @Created_on: 2022/3/16/13:26
 * ./ConcreteDecoratorB.java
 */
public class ConcreteDecoratorB extends Decorator{
    @Override
    public void Operation() {
        super.Operation();
        AddedBehavior();
        System.out.println("具体装饰对象B的操作");
    }
    private void AddedBehavior(){

    }
}
