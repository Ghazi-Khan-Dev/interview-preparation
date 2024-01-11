package org.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* org.demo.ShoppingCart.checkOut(..))")
    public void BeforeLogger(JoinPoint joinPoint) {
        Object[] args =  joinPoint.getArgs();
        String status = args[0].toString();
        System.out.println("args - " + status);
        System.out.println("Before logger called");
    }

    @After("execution(* *.*.*.checkOut(..))")
    public void AfterLogger() {
        System.out.println("After logger called");
    }


}
