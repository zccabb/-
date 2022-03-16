package CommandPattern.LooselyDesign;

import CommandPattern.Barbecuer;

/**
 * @Author: zcc
 * @Created_on: 2022/3/8/18:38
 * ./Command.java
 */
//抽象命令类
public abstract class Command {
    protected Barbecuer receiver;

    public Command(Barbecuer receiver){
        this.receiver=receiver;
    }
    abstract public void ExcuteCommand();
}
