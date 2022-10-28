package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.repositories.InterfaceA;
import com.example.demo.repositories.InterfaceB;
import com.example.demo.service.CommentService;

@Configuration
@ComponentScan(basePackages = { "com.example.demo.repositories.impl" })
public class AspectConfig {
	@Bean
	CommentService cs(InterfaceA a, InterfaceB b) {
		return new CommentService(a, b);
	}
}
