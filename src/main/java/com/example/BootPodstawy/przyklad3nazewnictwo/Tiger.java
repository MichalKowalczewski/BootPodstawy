package com.example.BootPodstawy.przyklad3nazewnictwo;

import org.springframework.stereotype.Component;

@Component("Tiger")
public class Tiger implements Animal {

    @Override
    public void displayName() {
        System.out.println("I am Tiger");
    }
}
