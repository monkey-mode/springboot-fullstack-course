package com.monkey_mode.learn_spring_framework.game;

public class App01GamingBasicJava {

    public static void main(String[] args) {
        // var marioGame = new MarioGame();
        // var superContraGame = new SuperContraGame();
        var pacmanGame = new PacmanGame();
        var gameRunner = new GameRunner(pacmanGame);
        gameRunner.run();
    }

}
