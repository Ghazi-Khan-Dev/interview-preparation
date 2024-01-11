package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@ComponentScan
public class Main {
    public static void main(String[] args) {

//        ApplicationContext context
//                = new ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext context
                = new AnnotationConfigApplicationContext(BeanConfig.class);

        Principal principal = context.getBean(Principal.class);
        principal.work();

//        Teacher staff = context.getBean(Teacher.class);
//        staff.work();
    }
}