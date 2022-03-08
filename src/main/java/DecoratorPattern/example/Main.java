package DecoratorPattern.example;

/**
 * @Author: zcc
 * @Created_on: 2022/3/16/14:20
 * ./Main.java
 */
public class Main {
    public static void main(String[] args) {
        Person person =new Person("超人");

        System.out.println("\n第一种装扮");

        ConcreteDecorator.Sneakers sneakers = new ConcreteDecorator.Sneakers();
        ConcreteDecorator.BigTrouser bigTrouser = new ConcreteDecorator.BigTrouser();
        ConcreteDecorator.Tshirts tshirts = new ConcreteDecorator.Tshirts();
        sneakers.Decorate(person);
        bigTrouser.Decorate(sneakers);
        tshirts.Decorate(bigTrouser);
        tshirts.Show();

        System.out.println("\n第二种装扮");

        ConcreteDecorator.Suit suit = new ConcreteDecorator.Suit();
        ConcreteDecorator.LeatherShoes leatherShoes = new ConcreteDecorator.LeatherShoes();
        ConcreteDecorator.Tie tie = new ConcreteDecorator.Tie();
        suit.Decorate(person);
        leatherShoes.Decorate(suit);
        tie.Decorate(leatherShoes);
        tie.Show();
    }
}
