package org.example;

import org.springframework.stereotype.Component;

@Component
public class Teacher implements Staff {
    public void work() {
        System.out.println("Teacher is teaching");
    }
}
