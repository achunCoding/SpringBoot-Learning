package top.wycfight.springbootlombok.bean;

import lombok.Builder;
import lombok.experimental.UtilityClass;

/**
 * @author: wycfight@163.com
 * @description: 用户实体 使用lombock
 * @create: 2019-07-01 16:52
 * @modified By:
 **/
@UtilityClass
@Builder
public class LombockUser {
    public String getName() {
        return "name";
    }

    public static void main(String[] args) {
        String name = LombockUser.getName();
        System.out.println(name);
    }
}
