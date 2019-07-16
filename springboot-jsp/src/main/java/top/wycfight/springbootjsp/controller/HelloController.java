package top.wycfight.springbootjsp.controller;

import org.omg.DynamicAny._DynAnyFactoryStub;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.Map;

/**
 * @author: wycfight@163.com
 * @description: HelloController
 * @create: 2019-07-15 08:50
 * @modified By:
 **/
@Controller
public class HelloController {
    /**
     * Hello
     *
     * @return
     */
    @GetMapping("/")
    public String hello(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", "hello world");
        return "hello";
    }

    /**
     * 传递值到到前端页面
     * @param model
     * @param request
     * @return
     */
    @GetMapping("/user")
    public String user(Map<String, Object> model, HttpServletRequest request) {
        model.put("name", "xixi");
        model.put("salary", 888888);
        request.getSession().setAttribute("count", 6);
        return "user";
    }
}
