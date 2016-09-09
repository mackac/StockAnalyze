package main.java;

/**
 * Created by root on 8/25/16.
 */
public class IndicatorsSingleton {

    private static IndicatorsSingleton instance = null;

    protected IndicatorsSingleton () {

    }

    public static IndicatorsSingleton getInstance() {
        if(instance == null) {
            instance = new IndicatorsSingleton();
        }
        return instance;
    }

    public float calcPE(float value, float earnings) {
        return value/earnings;
    }

    public float calcPriceDivEquityCapital(float price, float equityCapital) {
        return price/equityCapital;
    }

    public float calcReturnOfAssets(float profit, float equityCapital, float commitments) {
        return profit / (equityCapital + commitments);
    }

    public float calcTotalDebt(float commitments, float equityCapital) {
        return commitments / (equityCapital + commitments);
    }

    public float calcEquityValue(float stockPrice, int stockCount) {
        return stockCount * stockPrice;
    }

    public float calcEnterpriseValue(float equityValue, float netDebt) {
        return equityValue + netDebt;
    }


}
