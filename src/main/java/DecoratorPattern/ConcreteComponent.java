package DecoratorPattern;

/**
 * @Author: zcc
 * @Created_on: 2022/3/16/13:19
 * ./ConcreteComponent.java
 */
public class ConcreteComponent extends Component {
    @Override
    public void Operation() {
        System.out.println("具体操作对象");
    }
}
