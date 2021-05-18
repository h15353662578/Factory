package com.hs.CeLue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Huasheng
 * @Date 2021/05/18/15:07
 * 支付宝支付
 * @Description
 */
public class PayByAliPay implements PayStrategy {
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private CreditCard creditCard;

    @Override
    public void collectPaymentDetails(){
        try {
            System.out.print("手机号: ");
            String number = reader.readLine();
            System.out.print("日期: ");
            String date = reader.readLine();
            System.out.print("验证码: ");
            String cvv = reader.readLine();
            creditCard = new CreditCard(number, date, cvv);
        } catch (IOException exception){
            exception.printStackTrace();
        }
    }

    @Override
    public boolean pay(int paymentAmount){
        if (cardIsPresent()){
            System.out.println("支付"+paymentAmount+"支付宝");
            creditCard.setAmount(creditCard.getAmount() - paymentAmount);
            return true;
        }else {
            return false;
        }
    }

    private boolean cardIsPresent(){
        return creditCard != null;
    }
}
