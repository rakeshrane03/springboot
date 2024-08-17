package com.in28minutes.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.GamingConsole;
import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;
import com.in28minutes.learn_spring_framework.game.PacmanGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(GammingConfiguration.class);
		var game = context.getBean(GamingConsole.class);
		game.up();
		 context.getBean(GameRunner.class).run();
	}

}
