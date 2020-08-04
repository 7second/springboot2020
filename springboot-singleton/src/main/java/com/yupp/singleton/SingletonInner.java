package com.yupp.singleton;

/**
 * @author yupanpan
 * @date 2020/8/4 23:25
 */
public class SingletonInner {
    //私有构造器
    private SingletonInner(){}
    //内部静态类
    private static class InstanceHolder{
        private InstanceHolder(){}
        private static final SingletonInner singleton = new SingletonInner();
    }
    //公有实例化方法
    public static SingletonInner getInstance(){
        return InstanceHolder.singleton;
    }
}
