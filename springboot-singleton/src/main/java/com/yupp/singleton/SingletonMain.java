package com.yupp.singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yupanpan
 * @date 2020/8/4 23:22
 */
@SpringBootApplication
public class SingletonMain {
    public static void main(String[] args) {
        SpringApplication.run(SingletonMain.class, args);
        System.out.println(Math.round(-1.5));

    }
}
