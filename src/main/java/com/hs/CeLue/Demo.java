package com.hs.CeLue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Huasheng
 * @Date 2021/05/18/15:37
 * @Description
 */
public class Demo {
    private static Map<Integer,Integer>price = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static{
        price.put(1,2200);
        price.put(2,2000);
        price.put(3,4000);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;
            String continueChoice;
            do {
                System.out.println("选择商品");
                int choice = Integer.parseInt(reader.readLine());
                cost = price.get(choice);
                System.out.println("数量");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.println("确定下单吗 Y/N");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("Y"));
            if (strategy == null) {
                System.out.println("选择支付方式1 支付宝 2 PayPal");
                String paymentMethod = reader.readLine();
                if (paymentMethod.equals("1")) {
                    strategy = new PayByAliPay();
                } else if (paymentMethod.equals("2")) {
                    strategy = new PayByPayPal();
                } else {
                    return;
                }
            }
            order.processOrder(strategy);
            System.out.println("支付方式" + order.getTotalCost());
            String proceed = reader.readLine();
            if (proceed.equalsIgnoreCase("P")) {
                // Finally, strategy handles the payment.
                if (strategy.pay(order.getTotalCost())) {
                    System.out.println("Payment has been successful.");
                } else {
                    System.out.println("FAIL! Please, check your data.");
                }
                order.setClosed();
            }
        }
    }
}
