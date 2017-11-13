package com.example.springdemorhr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
@Configuration
@ComponentScan({"cz.expertkom.ju.springdemo.entity", "com.example.springdemorhr",
				"com.example.springdemorhr.interfaces", "com.example.springdemorhr.repository2"
	
})
*/


@SpringBootApplication
public class SpringdemorhrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringdemorhrApplication.class, args);
	}
}
