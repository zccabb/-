package StrategyPattern;

/**
 * @Author: zcc
 * @Created_on: 2022/3/7/19:34
 * ./CashNormal.java
 */
public class CashNormal implements CashSuper{
    public double acceptCash(double money){
        return money;
    }
}
