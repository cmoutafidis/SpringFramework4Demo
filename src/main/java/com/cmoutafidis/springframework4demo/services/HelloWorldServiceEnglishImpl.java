package com.cmoutafidis.springframework4demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Controller
@Profile("english")
public class HelloWorldServiceEnglishImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hello World";
    }
}
