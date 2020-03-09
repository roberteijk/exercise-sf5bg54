package net.vandeneijk.learn.exercisesf5bg54;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:ChuckNorrisConfiguration.xml")
public class ExerciseSf5bg54Application {

	public static void main(String[] args) {
		SpringApplication.run(ExerciseSf5bg54Application.class, args);
	}

}
