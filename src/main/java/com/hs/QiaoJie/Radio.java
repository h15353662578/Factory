package com.hs.QiaoJie;

/**
 * @author Huasheng
 * @Date 2021/05/10/10:47
 * 收音机
 * @Description
 */
public class Radio implements Device{

    private boolean on = false;

    private int volume = 30;

    private int channel = 1;


    @Override
    public boolean ieEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable(){
        on = false;
    }

    @Override
    public int getVolume(){
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (volume > 100){
            this.volume = 100;
        }else if (volume < 0){
            this.volume = 0;
        }else {
            this.volume = volume;
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println("-----------");
        System.out.println("创建一个收音机");
        System.out.println("收音机状态" + (on ? "enable":"disable"));
        System.out.println("音量"+volume+"%");
        System.out.println("频道"+channel);
        System.out.println("-----------");
    }
}
