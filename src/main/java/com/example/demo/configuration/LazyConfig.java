package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.CommentService;
import com.example.demo.service.CommentService_DI;
import com.example.demo.service.UserService_DI;

//@Lazy
@Configuration
//@ComponentScan(basePackages = { "com.example.demo.service", "com.example.demo.repositories.impl" })
public class LazyConfig {
	@Bean
	CommentService cs() {
		return new CommentService();
	}

	@Bean
	CommentService_DI csdi() {
		return new CommentService_DI();
	}

	@Bean
	UserService_DI usdi() {
		return new UserService_DI(null, null);
	}
}
