package top.wycfight.springbootweb01.usertest;

import org.junit.Before;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import top.wycfight.springbootweb01.controller.UserController;

/**
 * @author: wycfight@163.com
 * @description: 用户测试类
 * @create: 2019-07-11 09:03
 * @modified By:
 **/
@SpringBootTest
public class UserControllerTest {

    private MockMvc mvc;


    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }

    @Test
    public void getUser() throws Exception {
        String contentAsString = mvc.perform(MockMvcRequestBuilders.post("/getUser")).andReturn().getResponse().getContentAsString();
        System.out.println("result:" +contentAsString);
    }

    @Test
    public void getUsers() throws Exception {
        String contentAsString = mvc.perform(MockMvcRequestBuilders.get("/getUsers")).andReturn().getResponse().getContentAsString();
        System.out.println("result:" +contentAsString);
    }



}
