package com.sofka.cacheable.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;



@SpringBootApplication
@Configuration
@EnableCaching
public class CacheableApplication{


	
	public static void main(String[] args) {
		SpringApplication.run(CacheableApplication.class, args);
	}


}
