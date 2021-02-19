package com.example.BootPodstawy.zadanie1;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private final ApplicationEventPublisher applicationEventPublisher;

    Calculator(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void calculate(){
        for (int i = 0; i<100; i++){
            System.out.println(i);
            if (i%2==0){
                applicationEventPublisher.publishEvent(new EvenEvent(this));
            }
        }
        applicationEventPublisher.publishEvent(new FinishedEvent(this));
    }
}
