package com.hs.CeLue;

/**
 * @author Huasheng
 * @Date 2021/05/18/15:17
 * @Description
 */
public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(PayStrategy strategy){
        strategy.collectPaymentDetails();
    }

    public void setTotalCost(int cost){
        this.totalCost += cost;
    }
    public int getTotalCost(){
        return totalCost;
    }
    public boolean isClosed(){
        return isClosed;
    }
    public void setClosed(){
        isClosed = true;
    }
}
