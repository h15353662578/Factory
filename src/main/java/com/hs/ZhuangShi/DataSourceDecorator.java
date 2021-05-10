package com.hs.ZhuangShi;

/**
 * @author Huasheng
 * @Date 2021/05/10/16:40
 * 抽象装饰类
 * @Description
 */
public class DataSourceDecorator implements DataSource{

    private DataSource wrapper;

    DataSourceDecorator(DataSource source){
        this.wrapper = source;
    }

    @Override
    public void writeData(String data){
        wrapper.writeData(data);
    }

    @Override
    public String readData(){
        return wrapper.readData();
    }
}
