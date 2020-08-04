package com.yupp.singleton;

/**
 * @author yupanpan
 * @date 2020/8/4 23:26
 */
public enum EnumSingleton {
    INSTANCE;
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
