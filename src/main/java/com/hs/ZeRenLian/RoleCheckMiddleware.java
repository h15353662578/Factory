package com.hs.ZeRenLian;

/**
 * @author Huasheng
 * @Date 2021/05/10/19:27
 * 检查用户角色
 * @Description
 */
public class RoleCheckMiddleware extends Middleware{
    public boolean check(String email,String password){
        if (email.equals("h1785222224@qq.com")){
            System.out.println("Hello Huasheng");
            return true;
        }
        System.out.println("Hello user");
        return checkNext(email,password);
    }
}
