package com.example.BootPodstawy.przyklad1autowired;

import org.springframework.stereotype.Component;

@Component // https://www.javacodegeeks.com/2017/11/difference-component-service-controller-repository-spring.html
public class HelloWorld {

    public String message(){
        return "Hello World";
    }

}
