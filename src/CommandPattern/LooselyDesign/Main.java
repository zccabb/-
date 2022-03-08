package CommandPattern.LooselyDesign;

import CommandPattern.Barbecuer;

/**
 * @Author: zcc
 * @Created_on: 2022/3/8/19:37
 * ./Main.java
 */
//客户端
public class Main {
    public static void main(String[] args) {
        //准备
        Barbecuer boy = new Barbecuer();
        Command backMuttonCommand1 = new BackMuttonCommand(boy);
        Command backMuttonCommand2 = new BackMuttonCommand(boy);
        Command backChickenWingCommand1 = new BackChickenWingCommand(boy);
        Waiter waiter = new Waiter();

        //点菜
        waiter.setOrders(backMuttonCommand1);
        waiter.setOrders(backMuttonCommand2);
        waiter.setOrders(backChickenWingCommand1);
        //做
        waiter.Notify();
    }
}
