package top.wycfight.springbootjsp;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author: wycfight@163.com
 * @description:
 * @create: 2019-07-16 09:24
 * @modified By:
 **/
public class ServletInitializer extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(SpringbootJspApplication.class);
    }
}
