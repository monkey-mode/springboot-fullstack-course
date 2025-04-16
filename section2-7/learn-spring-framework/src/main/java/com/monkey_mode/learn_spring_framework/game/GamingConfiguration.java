package com.monkey_mode.learn_spring_framework.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class GamingConfiguration {

    @Bean
    @Primary
    public GamingConsole pacmanGame() {
        return new PacmanGame();
    }

    @Bean
    public GamingConsole superContraGame() {
        return new SuperContraGame();
    }

    @Bean
    public GamingConsole marioGame() {
        return new MarioGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }

}
