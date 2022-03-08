package StrategyPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: zcc
 * @Created_on: 2022/3/7/20:32
 * ./StrategyPatternDome.java
 */
public class StrategyPatternDome {
    public static void main(String[] args) {
        double total=0.0d;
        List<String> str = new ArrayList<>();
        str.add("正常收费");
        str.add("满300返100");
        str.add("打八折");
        System.out.println("请选择收费类型");
        for(int i=0;i<str.size();i++){
            System.out.println("选择"+str.get(i)+"输入"+i);
        }
        Scanner input =new Scanner(System.in);
        int pos=input.nextInt();
        CashContext csuper= new CashContext(str.get(pos));
        double totalPrice = 0d;
        System.out.println("输入商品单价和数量:");
        input.nextLine();
        String Price=input.nextLine();
        //input.nextLine();
        String Nums=input.nextLine();
        //System.out.println(Price+"|"+Nums);
        totalPrice = csuper.GetResult(Double.parseDouble(Price)*Double.parseDouble(Nums));
        total+=totalPrice;
        System.out.println(total);
    }
}
