package top.wycfight.springbootweb01.model;

import lombok.Data;

/**
 * @author: wycfight@163.com
 * @description: 用户实体
 * @create: 2019-07-11 08:48
 * @modified By:
 **/
@Data
public class User {
    /**
     * 名称
     */
    private String name;
    /**
     * 年龄
     */
    private int age;
    /**
     * 密码
     */
    private String pass;

}
