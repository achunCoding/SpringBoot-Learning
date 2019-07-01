package top.wycfight.springbootswagger.config.bean;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: wycfight@163.com
 * @description: Swagger2配置属性
 * @create: 2019-07-01 15:15
 * @modified By:
 **/
@Component
@ConfigurationProperties(prefix = "swagger")
@Getter
@Setter
public class Swagger2 {
    /**
     * 标题
     */
    @Value("${swagger.title}")
    private String title;
    /**
     * 描述
     */
    @Value("${swagger.description}")
    private String description;
    /**
     * 版本
     */
    @Value("${swagger.version}")
    private String version;
    /**
     * termsOfServiceUrl
     */
    @Value("${swagger.termsOfServiceUrl}")
    private String termsOfServiceUrl;
    /**
     * 名称
     */
    @Value("${swagger.contact.name}")
    private String name;
    /**
     * URL
     */
    @Value("${swagger.contact.url}")
    private String url;
    /**
     * Email
     */
    @Value("${swagger.contact.email}")
    private String email;
}