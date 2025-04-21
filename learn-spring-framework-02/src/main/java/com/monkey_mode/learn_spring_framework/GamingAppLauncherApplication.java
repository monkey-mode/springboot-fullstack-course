package com.monkey_mode.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.monkey_mode.learn_spring_framework.game.GameRunner;

@Configuration
@ComponentScan("com.monkey_mode.learn_spring_framework.game")
public class GamingAppLauncherApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
            context.getBean(GameRunner.class).run();
        }
    }

}
