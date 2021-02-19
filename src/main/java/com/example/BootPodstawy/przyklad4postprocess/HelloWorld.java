package com.example.BootPodstawy.przyklad4postprocess;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class HelloWorld {

    public String message(){
        return "Hello World";
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean is going through init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Bean will be destroyed now");
    }

}
