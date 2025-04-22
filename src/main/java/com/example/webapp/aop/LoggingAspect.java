package com.example.webapp.aop;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* com.example.webapp.service.UserService.*(..))")
    public void logBefore() {
        System.out.println("UserService method called.");
    }
}