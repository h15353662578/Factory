package com.hs.ZeRenLian;

import java.io.IOException;

/**
 * @author Huasheng
 * @Date 2021/05/10/17:57
 * 检查请求数量限制
 * @Description
 */
public class ThrottlingMiddleware extends Middleware{

    private int requestPerMinute;

    private int request;

    private long curTime;

    public ThrottlingMiddleware(int requestPerMinute){
        this.requestPerMinute = requestPerMinute;
        this.curTime = System.currentTimeMillis();
    }

    //请不要在开头插入checkNext() 这是一种方法 这比在所有中间件的简单循环更灵活
    public boolean check(String email,String password) {
        if (System.currentTimeMillis() > curTime + 60_000){
            request = 0;
            curTime = System.currentTimeMillis();
        }

        request ++;

        if (request > requestPerMinute){
            System.out.println("请求太多");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
        }
        return checkNext(email,password);
    }
}
