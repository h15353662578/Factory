package com.hs.QiaoJie;

/**
 * @author Huasheng
 * @Date 2021/05/10/10:46
 * 所有设备通用接口
 * @Description
 */
public interface Device {

    boolean ieEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
