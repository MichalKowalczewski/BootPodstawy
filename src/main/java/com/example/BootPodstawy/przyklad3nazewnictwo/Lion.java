package com.example.BootPodstawy.przyklad3nazewnictwo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Lion")
@Primary
public class Lion implements Animal {
    @Override
    public void displayName() {
        System.out.println("I am Lion");
    }
}
