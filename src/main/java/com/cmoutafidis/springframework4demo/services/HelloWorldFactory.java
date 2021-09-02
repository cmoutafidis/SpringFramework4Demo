package com.cmoutafidis.springframework4demo.services;

public class HelloWorldFactory {

    public HelloWorldService createHelloWorldService(String language) {
        HelloWorldService helloWorldService = null;

        switch (language) {
            case "en":
                helloWorldService = new HelloWorldServiceEnglishImpl();
                break;
            case "es":
                helloWorldService = new HelloWorldServiceSpanishImpl();
                break;
            default:
                helloWorldService = new HelloWorldServiceEnglishImpl();
        }

        return helloWorldService;
    }
}
