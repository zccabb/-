package DecoratorPattern.example;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: zcc
 * @Created_on: 2022/3/16/14:14
 * ./ConcreteDecorator.java
 */
//具体服饰类
public class ConcreteDecorator extends Finery{
     public static class Tshirts extends Finery{
        @Override
        public void Show() {
            System.out.println("大T恤");
            super.Show();
        }
    }
    public static class BigTrouser extends Finery{
        @Override
        public void Show() {
            System.out.println("垮裤");
            super.Show();
        }
    }
    public static class Sneakers extends Finery{
        @Override
        public void Show() {
            System.out.println("球鞋");
            super.Show();
        }
    }
    public static class Suit extends Finery{
        @Override
        public void Show() {
            System.out.println("西装");
            super.Show();
        }
    }
    public static class LeatherShoes extends Finery{
        @Override
        public void Show() {
            System.out.println("皮鞋");
            super.Show();
        }
    }
    public static class Tie extends Finery{
        @Override
        public void Show() {
            System.out.println("领带");
            super.Show();
        }
    }
}
