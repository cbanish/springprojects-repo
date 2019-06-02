package com.spring.stock.dbmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages="com.spring.stock")
@EntityScan(basePackages = {"com.spring.stock"})
public class DbMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbMicroserviceApplication.class, args);
	}

}
