package top.wycfight.rabbitmq.tiny.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

/**
 * @author: wycfight@163.com
 * @description:
 * @create: 2020-01-17 13:19
 * @modified By:
 **/
@Getter
@Setter
@ToString
public class User implements Serializable {

    private static final long serialVersionUID = -5916712761507779509L;
    private String name;

    private String password;
}
