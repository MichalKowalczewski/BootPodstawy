package com.example.BootPodstawy.przyklad4postprocess;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class InitHelloWorld implements BeanPostProcessor {

    public String message(){
        return "Init Hello World";
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("BeforeInitialization : " + beanName);
        return bean;  // you can return any other object as well
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("AfterInitialization : " + beanName);
        return bean;  // you can return any other object as well
    }
}