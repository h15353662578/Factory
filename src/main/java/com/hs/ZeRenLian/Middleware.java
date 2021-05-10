package com.hs.ZeRenLian;

/**
 * @author Huasheng
 * @Date 2021/05/10/17:52
 * 基础验证接口
 * @Description
 */
public abstract class Middleware {

    private Middleware next;

    //构建中间件对象链
    public Middleware linkWith(Middleware next){
        this.next = next;
        return next;
    }

    //子类通过具体检查来实现接口
    public abstract boolean check(String email,String password);

    //对链中的下一个对象进行检查或结束遍历
    public boolean checkNext(String email,String password){
        if (next == null){
            return true;
        }
        return next.check(email, password);
    }
}
