package com.springboot.springbootapp.helloworld;

import com.springboot.springbootapp.helloworld.game.GameRunner;
import com.springboot.springbootapp.helloworld.game.GamingConsole;
import com.springboot.springbootapp.helloworld.game.PackmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    //changes for dummy commit
    @Bean
    public GamingConsole game(){
        var game = new PackmanGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

}
