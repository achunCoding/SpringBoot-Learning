package top.wycfight.springbootweb01.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author: wycfight@163.com
 * @description: 加载自定义配置文件
 * @create: 2019-07-14 16:31
 * @modify By:
 **/
@Component
@ConfigurationProperties(prefix = "other")
@PropertySource("classpath:other.properties")
@Getter
@Setter
public class OtherProperties {
    private String xixi;
    private String haha;

}
