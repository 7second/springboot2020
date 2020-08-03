package com.yupp.springboot.springbootaop.cglibproxy;

import com.yupp.springboot.springbootaop.staticproxy.BuyHouse;
import com.yupp.springboot.springbootaop.staticproxy.BuyHouseImpl;

/**
 * @author yupanpan
 * @date 2020/8/3 23:03
 */
public class CglibProxyTest {
    public static void main(String[] args){
        BuyHouse buyHouse = new BuyHouseImpl();
        CglibProxy cglibProxy = new CglibProxy();
        BuyHouseImpl buyHouseCglibProxy = (BuyHouseImpl) cglibProxy.getInstance(buyHouse);
        buyHouseCglibProxy.buyHouse();
    }
}
