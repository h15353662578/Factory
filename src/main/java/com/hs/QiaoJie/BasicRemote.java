package com.hs.QiaoJie;

/**
 * @author Huasheng
 * @Date 2021/05/10/11:00
 * 基础控制器
 * @Description
 */
public class BasicRemote implements Remote{

    protected Device device;

    public BasicRemote(){}

    public BasicRemote(Device device){
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("控制器:音量控制");
        if (device.ieEnabled()){
            device.disable();
        }else {
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("音量控制 音量-");
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void channelDown() {
        System.out.println("频道控制 频道-");
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("频道控制 频道+");
        device.setChannel(device.getChannel() + 1);
    }

    @Override
    public void volumeUp() {
        System.out.println("控制音量 音量+");
        device.setVolume(device.getVolume() + 10);
    }
}
