package top.wycfight.rabbitmq.tiny.topic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author: wycfight@163.com
 * @description:
 * @create: 2020-01-17 13:59
 * @modified By:
 **/
@Slf4j
@Component
@RabbitListener(queues = "topic.messages")
public class TopicReveiver2 {

    @RabbitHandler
    public void process(String message) {
        log.info("TopicReveiver2 : " + message);
    }
}
