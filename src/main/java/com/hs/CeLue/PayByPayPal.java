package com.hs.CeLue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Huasheng
 * @Date 2021/05/18/14:42
 * 使用PayPal支付
 * @Description
 */
public class PayByPayPal implements PayStrategy{
    private static final Map<String,String> DATA_BASE = new HashMap<>();
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean signedIn;

    static {
        DATA_BASE.put("Huasheng","Huasheng@gmail.com");
        DATA_BASE.put("Huasheng9","Huasheng9@gmail.com");
    }

    @Override
    public void collectPaymentDetails(){
        try {
            while(!signedIn){
                System.out.println("------ Email:");
                email = reader.readLine();
                System.out.println("------ Password:");
                password = reader.readLine();
                if (verify()){
                    System.out.println("Data √");
                } else {
                    System.out.println("错误的邮箱 or 密码");
                }
            }
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }

    private boolean verify(){
        setSignedIn(email.equals(DATA_BASE.get(password)));
        return signedIn;
    }

    @Override
    public boolean pay(int paymentAmount){
        if (signedIn){
            System.out.println("支付中"+paymentAmount+"PayPal");
            return true;
        }else {
            return false;
        }
    }

    private void setSignedIn(boolean signedIn){
        this.signedIn = signedIn;
    }

}
