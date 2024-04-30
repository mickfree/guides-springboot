package com.example.schedulingtasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling // La @EnableScheduling garantiza que se cree un ejecutor de tareas en segundo plano. Sin él, no se programa nada.
public class GsSchedulingTasksApplication {

	public static void main(String[] args) {
		SpringApplication.run(GsSchedulingTasksApplication.class, args);
	}

}
