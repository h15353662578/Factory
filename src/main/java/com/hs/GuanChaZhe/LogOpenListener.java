package com.hs.GuanChaZhe;

import java.io.File;

/**
 * @author Huasheng
 * @Date 2021/05/11/15:49
 * 收到通知后在日志中记录一条数据
 * @Description
 */
public class LogOpenListener implements EventListener{
    private File log;

    public LogOpenListener(String fileName){
        this.log = new File(fileName);
    }

    public void update(String eventType,File file){
        System.out.println("保存日志"+log+"收件人"+eventType+"打开文件"+file.getName());
    }
}
