package com.cmoutafidis.springframework4demo;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldImpl implements HelloWorldService {

    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }
}
