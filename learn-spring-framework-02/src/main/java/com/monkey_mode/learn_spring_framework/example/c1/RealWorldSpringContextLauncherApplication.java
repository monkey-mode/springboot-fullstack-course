package com.monkey_mode.learn_spring_framework.example.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@Service
@ComponentScan
public class RealWorldSpringContextLauncherApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(RealWorldSpringContextLauncherApplication.class)) {

            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
