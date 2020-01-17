package top.wycfight.rabbitmq.tiny.object;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import top.wycfight.rabbitmq.tiny.entity.User;

/**
 * @author: wycfight@163.com
 * @description: 对象接收
 * @create: 2020-01-17 13:23
 * @modified By:
 **/
@Component
@RabbitListener(queues = "object")
@Slf4j
public class ObjectReceiver {

    @RabbitHandler
    public void process(User user) {
        log.info("ObjectReceiver: {}", user);
    }
}
