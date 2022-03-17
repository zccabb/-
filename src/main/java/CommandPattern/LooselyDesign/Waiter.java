package CommandPattern.LooselyDesign;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

/**
 * @Author: zcc
 * @Created_on: 2022/3/8/18:47
 * ./Waiter.java
 */
public class Waiter {
    private List<Command> orders = new LinkedList<>();

    //设置订单
    public void setOrders(Command command) {
        Date date =new Date();
        if(command.getClass().toString().equals("CommandPattern.BakeChickenWingCommand")){
            System.out.println("服务员:鸡翅没有了，请点别的烧烤");
        }
        else{
            orders.add(command);
            System.out.println("增加订单:"+command.getClass().toString()+" 时间:"+date.toString());
        }
    }
    //取消订单
    public void CancelOrders(Command command){
        Date date =new Date();
        orders.remove(command);
        System.out.println("取消订单: "+command.toString()+" 时间: "+date.toString());
    }
    //通知全部执行
    public void Notify(){
        for (Command command:orders) {
            command.ExcuteCommand();
        }
    }
}
