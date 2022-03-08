package StrategyPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: zcc
 * @Created_on: 2022/3/7/19:53
 * ./CashContext.java
 */
public class CashContext {
    private CashSuper cs;
    public CashContext(String type){
        cs = switch (type){
            case "正常收费"->new CashNormal();
            case "满300返100"->new CashReturn("300","100");
            case "打八折"->new CashRebate("0.8");
            default -> null;
        };
    }
    public double GetResult(double money){
        return cs.acceptCash(money);
    }


}
