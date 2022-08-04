package com.orquestrador.serie.api;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableRabbit
@SpringBootApplication
public class OrquestradorSeriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrquestradorSeriesApplication.class, args);
	}

}
