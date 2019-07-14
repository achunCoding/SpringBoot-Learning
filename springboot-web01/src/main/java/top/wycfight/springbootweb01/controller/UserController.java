package top.wycfight.springbootweb01.controller;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import top.wycfight.springbootweb01.model.User;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: wycfight@163.com
 * @description: 用户Controller
 * @create: 2019-07-11 08:53
 * @modified By:
 **/
@RestController
public class UserController {
    /**
     * 获取用户对象
     *
     * @return
     */
    @RequestMapping(value = "/getUser", method = RequestMethod.POST)
    public User getUser() {
        User user = new User();
        user.setAge(12);
        user.setName("weixiao");
        user.setPass("123456");
        return user;
    }

    @RequestMapping(value = "getUsers", method = RequestMethod.GET)
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setAge(16);
        user1.setName("xixi");
        user1.setPass("123456");
        users.add(user1);
        User user2 = new User();
        user2.setAge(18);
        user2.setName("hehe");
        user2.setPass("123456");
        users.add(user2);
        return users;
    }

    /**
     * 通过用户名称得到用户对象
     *
     * @param user 用户实体
     * @return 消息
     */
    @RequestMapping(value = "/getUserByName", method = RequestMethod.GET)
    public String getUserByName(User user) {
        // 调用Service层
        return "OK";
    }

    /**
     * 传递参数 占位符使用
     *
     * @param name 参数占位符
     * @return
     */
    @RequestMapping(value = "get/{name}", method = RequestMethod.GET)
    public String get(@PathVariable String name) {
        return name;
    }

    /**
     * 保存用户
     *
     * @param user 用户对象
     */
    @RequestMapping(value = "saveUser", method = RequestMethod.POST)
    public void saveUser(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError allError : allErrors) {
                System.out.println(allError.getCode() + "--" + allError.getDefaultMessage());
            }
        }
    }
}
