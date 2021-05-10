package com.hs.ZeRenLian;

/**
 * @author Huasheng
 * @Date 2021/05/10/19:17
 * @Description
 */
public class UserExistsMiddleware extends Middleware{

    private Server server;

    public UserExistsMiddleware(Server server){
        this.server = server;
    }

    public boolean check(String email,String password){
        if (!server.hasEmail(email)){
            System.out.println("该邮箱不存在");
            return false;
        }
        if (!server.isValidPassword(email,password)){
            System.out.println("错误的密码");
            return false;
        }
        return checkNext(email,password);
    }
}
