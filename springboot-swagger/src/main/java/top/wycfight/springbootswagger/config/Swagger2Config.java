package top.wycfight.springbootswagger.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import top.wycfight.springbootswagger.config.bean.Swagger2;

/**
 * @author: wycfight@163.com
 * @description: Swagger2API文档的配置
 * @create: 2019-07-01 15:13
 * @modified By:
 **/
@EnableSwagger2
@Configuration
public class Swagger2Config {

    @Autowired
    private Swagger2 swagger2;

    /**
     * 配置生成swagger2Api文档
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 加了ApiOperation注解的类，生成接口文档
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * 设置API信息
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(swagger2.getTitle())
                .description(swagger2.getDescription())
                .termsOfServiceUrl(swagger2.getTermsOfServiceUrl())
                .contact(new Contact(swagger2.getName(),swagger2.getUrl(),swagger2.getEmail()))
                .version(swagger2.getVersion())
                .build();
    }
}
