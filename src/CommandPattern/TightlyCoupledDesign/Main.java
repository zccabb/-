package CommandPattern.TightlyCoupledDesign;

import CommandPattern.Barbecuer;

/**
 * @Author: zcc
 * @Created_on: 2022/3/8/18:32
 * ./Main.java
 */
//客户端调用
public class Main {
    public static void main(String[] args) {
        Barbecuer boy = new Barbecuer();

        boy.BakeMutton();
        boy.BakeChickenWing();
        boy.BakeMutton();
    }
}
