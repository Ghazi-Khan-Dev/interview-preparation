package org.example;

import org.springframework.stereotype.Component;

@Component
public class Principal implements Staff{


    @Override
    public void work() {
        System.out.println("Principal is working");
    }
}
