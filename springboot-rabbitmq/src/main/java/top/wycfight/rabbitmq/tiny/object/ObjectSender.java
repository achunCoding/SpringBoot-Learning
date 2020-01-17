package top.wycfight.rabbitmq.tiny.object;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import top.wycfight.rabbitmq.tiny.entity.User;

import java.util.Date;

/**
 * @author: wycfight@163.com
 * @description: 对象发送
 * @create: 2020-01-17 13:23
 * @modified By:
 **/
@Slf4j
@Component
public class ObjectSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(User user) {
        log.info("ObjectSender user: {}", user.toString());
        amqpTemplate.convertAndSend("object", user);
    }
}
