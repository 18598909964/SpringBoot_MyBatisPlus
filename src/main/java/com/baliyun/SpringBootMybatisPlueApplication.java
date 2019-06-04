package com.baliyun;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import java.util.Date;


@Configuration
@MapperScan("com.baliyun.dao")
@Controller
@SpringBootApplication
public class SpringBootMybatisPlueApplication {

    private static org.slf4j.Logger logger = LoggerFactory.getLogger(SpringBootMybatisPlueApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMybatisPlueApplication.class, args);
        logger.info("\n"+
                " * ┏┓　　　┏┓\n" +
                " * ┏┛┻━━━┛┻┓\n" +
                " * ┃　　　　　　　┃\n" +
                " * ┃　　　━　　　┃\n" +
                " * ┃　┳┛　┗┳　┃\n" +
                " * ┃　　　　　　　┃\n" +
                " * ┃　　　┻　　　┃\n" +
                " * ┃　　　　　　　┃\n" +
                " * ┗━┓　　　┏━┛\n" +
                " * 　　┃　　　┃神兽保佑\n" +
                " * 　　┃　　　┃代码无BUG！\n" +
                " * 　　┃　　　┗━━━┓\n" +
                " * 　　┃　　　　　　　┣┓\n" +
                " * 　　┃　　　　　　　┏┛\n" +
                " * 　　┗┓┓┏━┳┓┏┛\n" +
                " * 　　　┃┫┫　┃┫┫\n" +
                " * 　　　┗┻┛　┗┻┛");
    }

    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

/*
    @Autowired()
    LandlordService landlordService;

    @ResponseBody
    @RequestMapping("/hello")
    public String test(){
        Landlord landlord = new Landlord();
        System.out.println("插入测试：");
        landlord.setPhone("18598988585");
        landlord.setUsername("王五");
        landlord.setUserPassword("123456");
        landlord.setUpdateDate(new Date());
        landlord.setRegisterDate(new Date());
        Boolean y = landlordService.insert(landlord);
        System.out.println(y);
        return "ok";
    }
*/

}
