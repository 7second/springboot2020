package com.yupp.springboot.hello;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author yupanpan
 * @date 2020/8/9 17:45
 */
@Component  //默认创建的队列  持久化  非独占  不是自动删除的队列
//@RabbitListener(queuesToDeclare = @Queue(value = "hello",durable = "true",autoDelete = "true"))
@RabbitListener
public class HelloCustomer {

    @RabbitHandler
    public void receive(String message) {
        System.out.println("message = " + message);
    }
}
