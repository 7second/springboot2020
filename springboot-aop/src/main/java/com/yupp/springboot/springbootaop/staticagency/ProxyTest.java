package com.yupp.springboot.springbootaop.staticagency;

/**
 * @author yupanpan
 * @date 2020/8/3 22:39
 * 测试类
 */
public class ProxyTest {
    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        buyHouse.buyHouse();
        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyHouse();
    }
}
