package com.hs.ZhuangShi;

/**
 * @author Huasheng
 * @Date 2021/05/10/16:21
 * 装饰是一种结构设计模式， 允许通过将对象放入特殊封装对象中来为原对象增加新的行为。
 * 由于目标对象和装饰器遵循同一接口， 因此你可用装饰来对对象进行无限次的封装。 结果对象将获得所有封装器叠加而来的行为。
 * @Description
 */
public interface DataSource {

    void writeData(String data);

    String readData();
}
