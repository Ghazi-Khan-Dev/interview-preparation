package org.demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* org.demo.ShoppingCart.checkOut())")
    public void logger() {
        System.out.println("Logger called");
    }
}
