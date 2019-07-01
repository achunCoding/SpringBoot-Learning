package top.wycfight.springbootswagger.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author: wycfight@163.com
 * @description: 用户实体类  -整合Swagger
 * @create: 2019-07-01 14:54
 * @modified By:
 **/
@Getter
@Setter
@ToString
@ApiModel("用户实体")
public class User {
    /**
     * 用户ID
     */
    @ApiModelProperty("用户 id")
    private Long id;
    /**
     * 用户名
     */
    @ApiModelProperty("用户名")
    private String username;
    /**
     * 密码
     */
    @ApiModelProperty("密码")
    private String password;
    /**
     * 爱好
     */
    @ApiModelProperty("爱好")
    private String hobby;
}
