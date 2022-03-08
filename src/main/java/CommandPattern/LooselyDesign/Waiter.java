package CommandPattern.LooselyDesign;
import java.util.LinkedList;
import java.util.List;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;

/**
 * @Author: zcc
 * @Created_on: 2022/3/8/18:47
 * ./Waiter.java
 */
public class Waiter {
    private List<Command> orders = new LinkedList<>();

    //设置订单
    public void setOrders(Command command) {
        if(command.toString().equals("命令模式.BakeChickenWingCommand")){
            System.out.println("服务员:鸡翅没有了，请点别的烧烤");
        }
        else{
            orders.add(command);
            System.out.println("增加订单:"+command.toString()+" 时间:"+time());
        }
    }
    //取消订单
    public void CancelOrders(Command command){
        orders.remove(command);
        System.out.println("取消订单: "+command.toString()+" 时间: "+time());
    }
    //通知全部执行
    public void Notify(){
        for (Command command:orders) {
            command.ExcuteCommand();
        }
    }
}
