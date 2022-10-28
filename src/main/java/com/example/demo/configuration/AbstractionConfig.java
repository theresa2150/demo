package com.example.demo.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.demo.repositories.InterfaceA;
import com.example.demo.repositories.InterfaceB;
import com.example.demo.repositories.impl.ImplA1;
import com.example.demo.repositories.impl.ImplA2;
import com.example.demo.repositories.impl.ImplB;
import com.example.demo.service.CommentService;
import com.example.demo.service.CommentService_DI;
import com.example.demo.service.UserService_DI;

@Configuration
//@ComponentScan(basePackages = { "" })
public class AbstractionConfig {
	@Bean
	ImplA1 implA1() {
		ImplA1 a1 = new ImplA1();
		return a1;
	}

	@Bean
	ImplA2 implA2() {
		ImplA2 a2 = new ImplA2();
		return a2;
	}

	@Bean
	ImplB implB() {
		ImplB b = new ImplB();
		return b;
	}

	@Bean
	CommentService commentService(@Qualifier("IA1") InterfaceA implA, InterfaceB implB) {
		System.out.println("Bean - commentService");
		CommentService cs = new CommentService(implA, implB);
		return cs;
	}

	@Bean
	@Primary
	CommentService commentService1() {
		System.out.println("Bean - commentService2");
		CommentService cs = new CommentService();
		return cs;
	}

	@Bean
	CommentService_DI commentService2(@Qualifier("IA1") InterfaceA implA, InterfaceB implB) {
		System.out.println("--------------");
		CommentService_DI csdi = new CommentService_DI(implA, implB);
		csdi.setB(new ImplB());
		System.out.println("cs.getCs() " + csdi.getCs());
		System.out.println("--------------");
		return csdi;
	}

	@Bean
	@Primary
	CommentService_DI commentService3() {
		System.out.println("==============");
		CommentService_DI cs = new CommentService_DI();
		System.out.println("cs.getCs() " + cs.getCs());
		System.out.println("==============");
		return cs;
	}

	@Bean
	UserService_DI userService4(@Qualifier("IA2") InterfaceA implA, InterfaceB implB,
			CommentService_DI csdi) {
		UserService_DI usdi = new UserService_DI(implA, implB);
		return usdi;
	}
}
