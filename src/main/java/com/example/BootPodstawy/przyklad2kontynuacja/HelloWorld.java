package com.example.BootPodstawy.przyklad2kontynuacja;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    private final AnotherBean anotherBean;

    private YetAnotherBean yetAnotherBean;

    //@Autowired - można, nie trzeba
    HelloWorld(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    @Autowired
    public void setYetAnotherBean(YetAnotherBean yetAnotherBean) {
        this.yetAnotherBean = yetAnotherBean;
    }

    public String message(){
        return "Hello World";
    }

    public void secondMessage() {
        anotherBean.anotherMessage();
        yetAnotherBean.yetAnotherMessage();
    }


}
