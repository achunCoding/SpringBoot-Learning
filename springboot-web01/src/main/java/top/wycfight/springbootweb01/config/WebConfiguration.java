package top.wycfight.springbootweb01.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import top.wycfight.springbootweb01.filter.MyFilter;
import top.wycfight.springbootweb01.filter.MyFilter02;

/**
 * @author: wycfight@163.com
 * @description: 自定义Filter配置
 * @create: 2019-07-14 15:45
 * @modify By:
 **/
@Configuration
public class WebConfiguration {
    @Bean
    public FilterRegistrationBean testFilterRegistration() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setName("MyFilter");
        filterRegistrationBean.setOrder(8);
        return filterRegistrationBean;
    }
    @Bean
    public FilterRegistrationBean test2FilterRegistration() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new MyFilter02());
        filterRegistrationBean.addUrlPatterns("/*");
        filterRegistrationBean.setName("MyFilter2");
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }
}
