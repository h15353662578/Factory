package com.hs.MoBan;

/**
 * @author Huasheng
 * @Date 2021/05/11/16:10
 * 另一个社交网络
 * @Description
 */
public class Twitter extends Network{
    public Twitter(String username,String password){
        this.username = username;
        this.password = password;
    }

    public boolean logIn(String username,String password){
        System.out.println("\n检查用户参数");
        System.out.println("用户名:" +this.username);
        System.out.println("密码:" +password);
        for (int i = 0;i < this.password.length();i++){
            System.out.println("*");
        }
        simulateNetworkLatency();
        System.out.println("\n\n登陆成功 Twitter");
        return true;
    }

    public boolean sendData(byte[] data){
        boolean messagePosted = true;
        if (messagePosted){
            System.out.println("信息:"+new String(data)+"输入");
            return true;
        }else {
            return false;
        }
    }

    public void logOut(){
        System.out.println("用户:"+username+"登录");
    }

    private void simulateNetworkLatency(){
        try{
            int i = 0;
            System.out.println();
            while (i < 10){
                System.out.println(".");
                Thread.sleep(100);
                i++;
            }
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }
}
