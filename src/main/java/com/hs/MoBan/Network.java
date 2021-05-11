package com.hs.MoBan;

/**
 * @author Huasheng
 * @Date 2021/05/11/16:00
 * 基础社交网络类
 * @Description
 */
public abstract class Network {
    String username;
    String password;

    Network(){}

    public boolean post(String message){
        if (logIn(this.username,this.password)){
            boolean result = sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String username,String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
