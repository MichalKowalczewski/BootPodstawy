package com.example.BootPodstawy.przyklad5event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ExampleListener {

    @EventListener
    public void onEvent(ExampleEvent exampleEvent){
        System.out.println("Example Event has been triggered: "+exampleEvent.getMessage());
    }

}
