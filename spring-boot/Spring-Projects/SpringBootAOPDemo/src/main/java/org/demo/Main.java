package org.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context
                = new AnnotationConfigApplicationContext(BeanConfig.class);

        ShoppingCart shoppingCart =
                context.getBean(ShoppingCart.class);

        shoppingCart.checkOut();
    }
}