package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.configuration.AbstractionConfig;
import com.example.demo.service.CommentService_DI;

public class TestAbstraction {

	private static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
			AbstractionConfig.class);

	public static void main(String[] args) {
//		ImplA1 a = new ImplA1();
//		ImplB b = new ImplB();
//		new CommentService(a, b).publishComment();

//		ImplA1 a1 = context.getBean(ImplA1.class);
//		ImplA2 a2 = context.getBean(ImplA2.class);
//		CommentService cs = context.getBean(CommentService.class);
//		a1.sendComment();
//		a2.sendComment();
//		cs.getA().sendComment();
		CommentService_DI csdi = context.getBean(CommentService_DI.class);
		System.out.println(csdi.getCs());
	}
}
