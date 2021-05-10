package com.hs.ZeRenLian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Huasheng
 * @Date 2021/05/10/19:33
 * @Description
 */
public class Demo {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init(){
        server = new Server();
        server.register("h1785222224@qq.com","admin_pass");
        server.register("TestExample@qq.com","test_pass");

        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server)).linkWith(new RoleCheckMiddleware());
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do{
            System.out.println("输入邮箱");
            String email = reader.readLine();
            System.out.println("输入密码");
            String password = reader.readLine();
            success = server.login(email,password);
        }while(!success);
    }
}
