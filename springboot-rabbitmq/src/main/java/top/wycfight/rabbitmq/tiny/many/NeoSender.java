package top.wycfight.rabbitmq.tiny.many;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: wycfight@163.com
 * @description:
 * @create: 2020-01-17 11:49
 * @modified By:
 **/
@Component
@Slf4j
public class NeoSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(int i) {
        String content = "SpringBoot neo queue " + "*******" + i;
        log.info("NeoSender: {}",content);
        amqpTemplate.convertAndSend("neo",content);
    }
}
