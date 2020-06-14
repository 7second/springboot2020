package com.yupp.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootHelloworldApplication {

    private static final Logger LOG = LoggerFactory.getLogger(SpringbootHelloworldApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringbootHelloworldApplication.class, args);

        System.out.printf("{}您好,您是第{}位访客\n", "张三", 2);
        System.out.printf("%s您好,您是第%s位访客\n", "张三", 2);

        LOG.debug("There are now " + 1 + " user accounts: " + 12);

        LOG.debug("There are now {} user accounts: {}", 12, 121212);
    }

}
