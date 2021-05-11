package com.hs.GuanChaZhe;

import java.io.File;

/**
 * @author Huasheng
 * @Date 2021/05/11/15:46
 * 收到通知后发送邮件
 * @Description
 */
public class EmailNotificationListener implements EventListener{
    private String email;

    public EmailNotificationListener(String email){
        this.email = email;
    }

    @Override
    public void update(String eventType, File file){
        System.out.println("邮箱"+email+":收件人"+eventType+"使用文件"+file.getName());
    }
}
