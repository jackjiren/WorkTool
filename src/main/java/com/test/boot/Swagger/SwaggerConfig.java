package com.test.boot.Swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableOpenApi
public class SwaggerConfig {

    //配置了swagger的Docket的bean实例
    //enable()是否启动swagger，如果为false，则不能在浏览器中访问
    //RequestHandlerSelectors:配置要扫描接口的方式
    //basePackage：指定要扫描的包
    //any（）：扫描全部
    // none（）：不扫描
    //withClassAnnotation()：扫描类上的注解
    //withMethodAnnotation():扫描方法上的注解
    @Bean
    public Docket docket(){

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.test.boot.controller"))
                //paths()：过滤路径
                //.paths(PathSelectors.ant("/wyl/**"))
                .build();
    }

    //配置文档信息
    private ApiInfo apiInfo(){
        //作者信息
        Contact contact = new Contact("zj","https://www.bilibili.com","601676855@qq.com");

        return new ApiInfo(
                "zj的swagger文档"
                , "zj的描述"
                , "1.0"
                , "https://www.bilibili.com"
                , contact
                , "Apache 2.0"
                , "http://www.apache.org/licenses/LICENSE-2.0"
                , new ArrayList());

    }
}
