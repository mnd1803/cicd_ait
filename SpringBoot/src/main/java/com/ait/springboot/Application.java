package com.ait.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.ait")
@EntityScan("com.ait.model")
@EnableJpaRepositories(basePackages= "com.ait.repository")
//@PropertySources({@PropertySource({"file:C:\\Users\\Mandar Chavan\\student.properties"})
//})



public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
