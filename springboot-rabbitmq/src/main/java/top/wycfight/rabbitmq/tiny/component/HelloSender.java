package top.wycfight.rabbitmq.tiny.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: wycfight@163.com
 * @description:
 * @create: 2020-01-17 11:01
 * @modified By:
 **/
@Slf4j
@Component
public class HelloSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
        String content = "hello" + new Date();
        log.info("Hello Sender: {}", content);
        amqpTemplate.convertAndSend("hello", content);
    }
}
