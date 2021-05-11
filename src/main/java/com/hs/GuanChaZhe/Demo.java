package com.hs.GuanChaZhe;

import java.io.IOException;

/**
 * @author Huasheng
 * @Date 2021/05/11/15:51
 * @Description
 */
public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("打开",new LogOpenListener("C://Users//Huasheng//Desktop//OutPut.txt"));
        editor.events.subscribe("保存",new EmailNotificationListener("admin@example.com"));
        try{
            editor.openFile("test.txt");
            editor.saveFile();
        }catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
