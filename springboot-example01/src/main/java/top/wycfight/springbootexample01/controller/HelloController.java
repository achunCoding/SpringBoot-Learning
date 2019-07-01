package top.wycfight.springbootexample01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wycfight@163.com
 * @description: Http请求处理
 * @create: 2019-07-01 11:40
 * @modified By:
 **/
@RestController
public class HelloController {
    /**
     * SpringBoot请求示例
     * @return 返回结果
     */
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
