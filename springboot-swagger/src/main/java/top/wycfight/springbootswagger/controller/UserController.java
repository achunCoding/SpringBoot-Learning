package top.wycfight.springbootswagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import top.wycfight.springbootswagger.bean.User;

/**
 * @author: wycfight@163.com
 * @description: 用户实体类 - 整合Swagger
 * @create: 2019-07-01 14:54
 * @modified By:
 **/
@RestController
@RequestMapping("/user")
@Api(tags = "用户相关接口", value = "提供用户相关的 Rest API")
public class UserController {

    @ApiOperation("新增用户接口")
    @PostMapping("/add")
    public boolean addUser(@RequestBody User user) {
        return false;
    }
    @ApiOperation("查询用户接口")
    @GetMapping("/find/{id}")
    public User findById(@PathVariable("id") int id) {
        return new User();
    }
    @ApiOperation("更新用户接口")
    @PutMapping("/update")
    public boolean update(@RequestBody User user) {
        return true;
    }
    @ApiOperation("删除用户接口")
    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable("id") int id) {
        return true;
    }
}
