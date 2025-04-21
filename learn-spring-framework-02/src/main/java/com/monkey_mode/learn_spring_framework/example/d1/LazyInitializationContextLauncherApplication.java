package com.monkey_mode.learn_spring_framework.example.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
}

@Component
@Lazy
class ClassB {

    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("Some initialization logic");
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("doSomething");
    }
}

@Configuration
@ComponentScan
public class LazyInitializationContextLauncherApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(LazyInitializationContextLauncherApplication.class)) {
            System.out.println("Initialization of context is completed");
            context.getBean(ClassB.class).doSomething();
            // Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
