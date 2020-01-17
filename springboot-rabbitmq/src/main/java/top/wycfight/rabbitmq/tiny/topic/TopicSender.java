package top.wycfight.rabbitmq.tiny.topic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: wycfight@163.com
 * @description:
 * @create: 2020-01-17 13:56
 * @modified By:
 **/
@Slf4j
@Component
public class TopicSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send1() {
        String content = "hi i am message1";
        log.info("TopicSender send1: {}", content);
        amqpTemplate.convertAndSend("exchange", "topic.message", content);
    }

    public void send2() {
        String content = "hi i am message2";
        log.info("TopicSender send2: {}", content);
        amqpTemplate.convertAndSend("exchange","topic.messages", content);
    }
}
