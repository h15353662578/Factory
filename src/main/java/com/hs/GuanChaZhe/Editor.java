package com.hs.GuanChaZhe;

import java.io.File;

/**
 * @author Huasheng
 * @Date 2021/05/11/15:42
 * 具体发布者
 * @Description
 */
public class Editor {
    public EventManager events;
    private File file;

    public Editor(){
        this.events = new EventManager("打开","保存");
    }

    public void openFile(String filePath){
        this.file = new File(filePath);
        events.notify("打开",file);
    }

    public void saveFile() throws Exception {
        if (this.file != null){
            events.notify("保存",file);
        }else {
            throw new Exception("请打开一个文件");
        }
    }
}
