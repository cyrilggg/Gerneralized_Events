package com.example.generalized_new;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.generalized_new.mapper")
public class GeneralizedNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeneralizedNewApplication.class, args);
	}

}
