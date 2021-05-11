package com.hs.GuanChaZhe;

import java.io.File;

/**
 * @author Huasheng
 * @Date 2021/05/11/15:46
 * 通观察者接口
 * @Description
 */
public interface EventListener {
    void update(String eventType, File file);
}
