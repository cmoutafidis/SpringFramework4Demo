package com.cmoutafidis.springframework4demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Controller
@Profile("spanish")
public class HelloWorldServiceSpanishImpl implements HelloWorldService {
    @Override
    public String getGreeting() {
        return "Hola Amigo";
    }
}
