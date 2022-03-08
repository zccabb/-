package CommandPattern.LooselyDesign;

import CommandPattern.Barbecuer;

/**
 * @Author: zcc
 * @Created_on: 2022/3/8/18:44
 * ./BackChickenWingCommand.java
 */
class BackChickenWingCommand extends Command{

    public BackChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void ExcuteCommand() {
        receiver.BakeChickenWing();
    }
}
