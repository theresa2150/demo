package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.configuration.AspectConfig;
import com.example.demo.service.CommentService;

public class TestAspect {
	private static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
			AspectConfig.class);

	public static void main(String[] args) {
		CommentService cs = context.getBean(CommentService.class);
		System.out.println("AA " + cs.getClass());
		cs.publishComment();
	}

}
