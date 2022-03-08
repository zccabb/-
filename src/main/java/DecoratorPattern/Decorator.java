package DecoratorPattern;

/**
 * @Author: zcc
 * @Created_on: 2022/3/16/13:20
 * ./Decorative.java
 */
public class Decorator extends Component{
    protected Component component;
    public void setComponent(Component component){
        this.component=component;
    }
    @Override
    public void Operation() {
        if(component!=null){
            component.Operation();
        }
    }
}
