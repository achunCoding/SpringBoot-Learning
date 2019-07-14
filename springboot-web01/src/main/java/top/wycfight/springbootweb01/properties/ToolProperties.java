package top.wycfight.springbootweb01.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author: wycfight@163.com
 * @description: 读取开头为tool的配置
 * @create: 2019-07-14 16:19
 * @modify By:
 **/
@Component
@ConfigurationProperties(prefix = "tool")
@Getter
@Setter
public class ToolProperties {
    private String title;
    private String youyai;
}
