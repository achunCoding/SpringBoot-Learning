package top.wycfight.springbootweb01.model;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

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
    @NotEmpty(message = "姓名不能为空")
    private String name;

    /**
     * 年龄
     */
    @Max(value = 100, message = "年龄不能大于100岁")
    @Min(value = 18, message = "18岁以上哦")
    private int age;
    /**
     * 密码
     */
    @NotEmpty(message = "密码不能为空")
    @Length(min = 6, message = "密码长度不能小于6位哦")
    private String pass;

}
