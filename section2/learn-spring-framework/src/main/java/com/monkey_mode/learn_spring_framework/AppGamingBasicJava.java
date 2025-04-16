package com.monkey_mode.learn_spring_framework;

import com.monkey_mode.learn_spring_framework.game.GameRunner;
import com.monkey_mode.learn_spring_framework.game.PacmanGame;

public class AppGamingBasicJava {

    public static void main(String[] args) {
        // var marioGame = new MarioGame();
        // var superContraGame = new SuperContraGame();
        var pacmanGame = new PacmanGame();
        var gameRunner = new GameRunner(pacmanGame);
        gameRunner.run();
    }

}
