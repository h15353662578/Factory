package com.hs.ZeRenLian;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Huasheng
 * @Date 2021/05/10/19:29
 * 授权目标
 * @Description
 */
public class Server {
    private Map<String ,String> users = new HashMap<>();
    private Middleware middleware;

    public void setMiddleware(Middleware middleware){
        this.middleware = middleware;
    }

    public boolean login(String email,String password){
        if (middleware.check(email,password)){
            System.out.println("授权成功");
            return true;
        }
        return false;
    }

    public void register(String email,String password){
        users.put(email,password);
    }

    public boolean hasEmail(String email){
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email,String password){
        return users.get(email).equals(password);
    }
}
