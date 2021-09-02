package com.cmoutafidis.springframework4demo.config;

import com.cmoutafidis.springframework4demo.services.HelloWorldService;
import com.cmoutafidis.springframework4demo.services.HelloWorldServiceEnglishImpl;
import com.cmoutafidis.springframework4demo.services.HelloWorldServiceSpanishImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {

    @Bean
    @Profile({"default", "english"})
    public HelloWorldService helloWorldServiceEnglish() {
        return new HelloWorldServiceEnglishImpl();
    }

    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldServiceSpanish() {
        return new HelloWorldServiceSpanishImpl();
    }
}
