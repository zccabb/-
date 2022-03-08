package StrategyPattern;

/**
 * @Author: zcc
 * @Created_on: 2022/3/7/19:35
 * ./CashRebate.java
 */
public class CashRebate implements CashSuper{
    private double moneyRebate = 1d;

    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
    public CashRebate(String moneyRebate){
        this.moneyRebate=Double.parseDouble(moneyRebate);
    }
}
