package com.hs.MoBan;

import sun.nio.ch.Net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Huasheng
 * @Date 2021/05/11/16:11
 * @Description
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.println("输入用户名");
        String username = reader.readLine();
        System.out.println("输入密码");
        String password = reader.readLine();

        System.out.println("输入信息");
        String message = reader.readLine();
        System.out.println("选择登陆账号\n1 Twitter\n2 FaceBook");
        int choice = Integer.parseInt(reader.readLine());

        if (choice ==1){
            network = new Twitter(username,password);
        }else if (choice == 2){
            network = new FaceBook(username,password);
        }else {
            System.out.println("没选项");
        }
        network.post(message);
    }
}
