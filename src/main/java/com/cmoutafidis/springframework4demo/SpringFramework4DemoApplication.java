package com.cmoutafidis.springframework4demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringFramework4DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = SpringApplication.run(SpringFramework4DemoApplication.class, args);
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
        helloWorld.sayHello();
    }

}
