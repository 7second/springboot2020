package com.yupp.springboot.springbootaop.staticproxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yupanpan
 * @date 2020/8/3 22:29
 * 创建代理类
 */
@Slf4j
public class BuyHouseProxy implements BuyHouse {

    private BuyHouse buyHouse;

    public BuyHouseProxy(final BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyHouse() {
        log.info("买房前准备");
        buyHouse.buyHouse();
        log.info("买房后装修");

    }
}
