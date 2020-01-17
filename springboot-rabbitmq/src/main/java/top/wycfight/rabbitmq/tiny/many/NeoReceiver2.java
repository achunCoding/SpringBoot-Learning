package top.wycfight.rabbitmq.tiny.many;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: wycfight@163.com
 * @description:
 * @create: 2020-01-17 11:53
 * @modified By:
 **/
@Component
@RabbitListener(queues = "neo")
@Slf4j
public class NeoReceiver2 {

    @RabbitHandler
    public void process(String neo) {
        log.info("NeoReceiver2: {}",neo);
    }
}
