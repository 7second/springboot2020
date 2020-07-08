package com.yupp.mydemo;

import java.util.concurrent.TimeUnit;

/**
 * @author yupanpan
 * @date 2020/6/29 22:26
 */
public class T1 {

    public void test01() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
