package com.springboot.springbootapp.helloworld;

import com.springboot.springbootapp.helloworld.game.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGamingBasicJava {

    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }

        //var game = new MarioGame();
        //var game = new SuperContraGame();
//        var game = new PackmanGame();
//        var gameRunner = new GameRunner(game);
//        gameRunner.run();
    }
}
