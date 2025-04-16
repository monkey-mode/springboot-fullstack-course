package com.monkey_mode.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.monkey_mode.learn_spring_framework.game.GameRunner;
import com.monkey_mode.learn_spring_framework.game.GamingConsole;
import com.monkey_mode.learn_spring_framework.game.MarioGame;
import com.monkey_mode.learn_spring_framework.game.PacmanGame;
import com.monkey_mode.learn_spring_framework.game.SuperContraGame;

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
