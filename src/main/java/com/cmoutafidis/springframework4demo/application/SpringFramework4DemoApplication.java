package com.cmoutafidis.springframework4demo.application;

import com.cmoutafidis.springframework4demo.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.cmoutafidis.springframework4demo")
public class SpringFramework4DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringFramework4DemoApplication.class, args);

        GreetingController greetingController = (GreetingController) ctx.getBean("greetingController");
        System.out.println(greetingController.sayHello());
    }

}
