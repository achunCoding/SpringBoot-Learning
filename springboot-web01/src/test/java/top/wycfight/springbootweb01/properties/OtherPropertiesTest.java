package top.wycfight.springbootweb01.properties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author: wycfight@163.com
 * @description: 读取配置
 * @create: 2019-07-14 16:10
 * @modify By:
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class OtherPropertiesTest {


    @Resource
    private OtherProperties otherProperties;

    @Test
    public void testOther() throws Exception {
        System.out.println("xixi:" + otherProperties.getXixi());
        System.out.println("haha:" + otherProperties.getHaha());
    }

}
