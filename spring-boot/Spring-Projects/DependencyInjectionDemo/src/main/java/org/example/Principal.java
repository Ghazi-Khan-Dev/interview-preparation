package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Principal implements Staff{

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Principal{" +
                "age=" + age +
                '}';
    }

    int age;

    @Override
    public void work() {
        System.out.println("Principal is working");
    }
}
