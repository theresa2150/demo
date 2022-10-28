package com.example.demo;

import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.bean.Person;
import com.example.demo.bean.Seaball;
import com.example.demo.configuration.AspectConfig;
import com.example.demo.configuration.LazyConfig;
import com.example.demo.configuration.ProjectConfig;
import com.example.demo.service.CommentService;

public class TestSpringContext {

	private static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
			ProjectConfig.class);
	private static AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(
			LazyConfig.class);
	private static AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(
			AspectConfig.class);

	public static void main(String[] args) {
//		System.out.println(context.getBean(String.class));
//		System.out.println(context.getBean(int.class));

//		Seaball seaball = context.getBean(Seaball.class); // NoUniqueBeanDefinitionException
		Seaball seaball = context.getBean("emily", Seaball.class);

		Supplier<Seaball> sp = () -> seaball;
		context.registerBean(Seaball.class, sp, bc -> bc.setPrimary(true));

		Seaball seaball1 = context.getBean(Seaball.class);
		System.out.println("aa " + seaball1.getName());

		Person person = context.getBean(Person.class);
		System.out.println("bb " + person.getName());
		System.out.println("cc " + person.getSeaball().getName());
		System.out.println("dd " + person.jf.getName());

		System.out.println("==============");
		CommentService cs1 = context1.getBean(CommentService.class);
		CommentService cs2 = context2.getBean(CommentService.class);
		System.out.println("cs1=" + cs1 + "\ncs2=" + cs2);
	}

}
