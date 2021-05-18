package com.hs.CeLue;

/**
 * @author Huasheng
 * @Date 2021/05/18/14:41
 * @Description
 * 通用支付方法
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
