package DecoratorPattern;

/**
 * @Author: zcc
 * @Created_on: 2022/3/16/13:29
 * ./Main.java
 */
public class Main {
    public static void main(String[] args) {
        ConcreteComponent c=new ConcreteComponent();
        ConcreteDecoratorA d1 =new ConcreteDecoratorA();
        ConcreteDecoratorB d2 =new ConcreteDecoratorB();

        d1.setComponent(c);
        d2.setComponent(d1);
        d2.Operation();
    }
}
