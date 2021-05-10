package com.hs.QiaoJie;

/**
 * @author Huasheng
 * @Date 2021/05/10/11:05
 * 高级控制器
 * @Description
 */
public class AdvancedRemote extends BasicRemote{

    public AdvancedRemote(Device device){
        super.device = device;
    }

    public void mute(){
        System.out.println("音量变为0");
        device.setVolume(0);
    }
}
