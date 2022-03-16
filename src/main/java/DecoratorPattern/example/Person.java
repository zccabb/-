package DecoratorPattern.example;

import lombok.Data;

/**
 * @Author: zcc
 * @Created_on: 2022/3/16/13:58
 * ./Person.java
 */

public class Person {
    private String name;
    public Person(){
    }
    public Person(String name){
        this.name=name;
    }

    public void Show(){
        System.out.println("装扮的"+name);
    }
}
