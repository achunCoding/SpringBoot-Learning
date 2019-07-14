package top.wycfight.springbootweb01.properties;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author: wycfight@163.com
 * @description: 读取单个配置
 * @create: 2019-07-14 16:10
 * @modify By:
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {
    @Value("${tool.title}")
    private String title;

    @Resource
    private ToolProperties toolProperties;

    @Test
    public void testMore() throws Exception {
        System.out.println("title:" + toolProperties.getTitle());
        System.out.println("youyai:" + toolProperties.getYouyai());
    }

    @Test
    public void testProperties() throws Exception {
        Assert.assertEquals(title, "嘻嘻哈哈");
    }
}
