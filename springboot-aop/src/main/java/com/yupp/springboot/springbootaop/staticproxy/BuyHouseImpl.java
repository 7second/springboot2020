package com.yupp.springboot.springbootaop.staticproxy;

import lombok.extern.slf4j.Slf4j;

/**
 * @author yupanpan
 * @date 2020/8/3 22:27
 * 实现服务接口
 */
@Slf4j
public class BuyHouseImpl implements BuyHouse{

    @Override
    public void buyHouse() {
        log.info("我要买房！！！");
    }
}
