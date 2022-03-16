package CommandPattern.LooselyDesign;

import CommandPattern.Barbecuer;

/**
 * @Author: zcc
 * @Created_on: 2022/3/8/18:43
 * ./BackMuttonCommand.
 */
class BackMuttonCommand extends Command {
    public BackMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void ExcuteCommand() {
        receiver.BakeMutton();
    }
}
