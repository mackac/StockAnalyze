package main.java;

/**
 * Created by root on 8/19/16.
 */
public class StockAtributes {
    private float openingPrice;
    private float closingPrice;
    private float lowestPrice;
    private float highestPrice;
    private int volume;
    private long timeAndDate;


    public StockAtributes(int cost, long time) {
        openingPrice = cost;
        timeAndDate = time;
    }

    public float getOpeningPrice() {
        return openingPrice;
    }

    public long getTimeAndDate() {
        return timeAndDate;
    }

}
