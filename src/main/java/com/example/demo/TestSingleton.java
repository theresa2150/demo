package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.configuration.LazyConfig;
import com.example.demo.service.CommentService;
import com.example.demo.service.CommentService_DI;
import com.example.demo.service.UserService_DI;

public class TestSingleton {
	private static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
			LazyConfig.class);

	public static void main(String[] args) {

		System.out.println("AAAAAAAAA1");
		CommentService_DI a1 = context.getBean(CommentService_DI.class);
		CommentService_DI a2 = context.getBean(CommentService_DI.class);
		System.out.println(a1 == a2);

		System.out.println("AAAAAAAAA2");
		UserService_DI a3 = context.getBean(UserService_DI.class);
		System.out.println(a1.getA() == a3.getA());

		System.out.println("AAAAAAAAA3");
		CommentService cs = context.getBean(CommentService.class);
		System.out.println(cs.getA());
	}

}
