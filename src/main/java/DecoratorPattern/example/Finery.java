package DecoratorPattern.example;

import lombok.Data;

/**
 * @Author: zcc
 * @Created_on: 2022/3/16/14:05
 * ./Finery.java
 */
//服饰类
public class Finery extends Person{
    protected Person component;
    public void Decorate(Person component){
        this.component=component;
    }
    @Override
    public void Show() {
        if(component!=null){
            component.Show();
        }
    }
}
