package org.example;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Principal implements Staff, BeanNameAware {

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

    @Override
    public void setBeanName(String s) {
        System.out.println("setBeanName method called ...");
    }
}
