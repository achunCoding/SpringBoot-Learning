package top.wycfight.rabbitmq.sendtest;

import lombok.ToString;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import top.wycfight.rabbitmq.tiny.component.HelloSender;
import top.wycfight.rabbitmq.tiny.entity.User;
import top.wycfight.rabbitmq.tiny.many.NeoSender;
import top.wycfight.rabbitmq.tiny.many.NeoSender1;
import top.wycfight.rabbitmq.tiny.object.ObjectSender;
import top.wycfight.rabbitmq.tiny.topic.TopicSender;

/**
 * @author: wycfight@163.com
 * @description:
 * @create: 2020-01-17 11:07
 * @modified By:
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitMqHelloTest {

    @Autowired
    private HelloSender helloSender;


    @Autowired
    private NeoSender neoSender;

    @Autowired
    private NeoSender1 neoSender1;

    @Autowired
    private ObjectSender objectSender;


    @Autowired
    private TopicSender topicSender;

    @Test
    public void hello() throws InterruptedException {
        helloSender.send();
        Thread.sleep(10001);
    }

    @Test
    public void oneToMany() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            neoSender.send(i);
        }
        Thread.sleep(10000);
    }

    @Test
    public void manyToMany() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            neoSender.send(i);
            neoSender1.send(i);
        }
        Thread.sleep(10000);
    }

    @Test
    public void objectSender() throws InterruptedException {
        User user = new User();
        user.setName("Lucky Boy");
        user.setPassword("123456");
        objectSender.send(user);
        Thread.sleep(10000);
    }

    @Test
    public void topic1() throws InterruptedException {
        topicSender.send1();
        Thread.sleep(10001);
    }

    @Test
    public void topic2() throws InterruptedException {
        topicSender.send2();
        Thread.sleep(10001);
    }
}
