package top.wycfight.rabbitmq.tiny.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: wycfight@163.com
 * @description:
 * @create: 2020-01-17 11:05
 * @modified By:
 **/
@Component
@RabbitListener(queues = "hello")
@Slf4j
public class HelloReceiver {

    @RabbitHandler
    public void process(String hello) {
        log.info("HelloReceiver:{}", hello);
    }
}
