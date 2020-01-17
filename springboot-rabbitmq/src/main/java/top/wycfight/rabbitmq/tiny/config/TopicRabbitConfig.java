package top.wycfight.rabbitmq.tiny.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.BindingResult;

/**
 * @author: wycfight@163.com
 * @description:
 * @create: 2020-01-17 13:37
 * @modified By:
 **/
@Configuration
public class TopicRabbitConfig {
    final static String message = "topic.message";
    final static String messages = "topic.messages";

    /**
     * 定义队列
     * @return
     */
    @Bean
    public Queue queueMessage() {
        return new Queue(message);
    }

    @Bean
    public Queue queueMessages() {
        return new Queue(messages);
    }

    /**
     * 定义交换机
     * @return
     */
    @Bean
    TopicExchange exchange() {
        return new TopicExchange("exchange");
    }

    /**
     * 将队列和交换机进行绑定
     * @param queueMessage
     * @param exchange
     * @return
     */
    @Bean
    Binding bindingExchangeMessage(Queue queueMessage, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessage).to(exchange).with("topic.message");
    }

    @Bean
    Binding bindingExchangeMessages(Queue queueMessages, TopicExchange exchange) {
        return BindingBuilder.bind(queueMessages).to(exchange).with("topic.#");
    }


}
