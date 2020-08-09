package com.yupp.springboot.work;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author yupanpan
 * @date 2020/8/9 18:00
 */
@Component
public class WorkCustomer {

    //第一个消费者
    @RabbitListener(queuesToDeclare = @Queue("work"))
    public void receive1(String message) {
        System.out.println("message1 = "+message);
    }

    //第二个消费者
    @RabbitListener(queuesToDeclare = @Queue("work"))
    public void receive2(String message) {
        System.out.println("message2 = "+message);
    }
}
