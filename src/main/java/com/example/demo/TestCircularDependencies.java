package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.bean.BeanA;
import com.example.demo.bean.BeanB;
import com.example.demo.configuration.CircularDependenciesConfig;

public class TestCircularDependencies {
	private static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
			CircularDependenciesConfig.class);

	public static void main(String[] args) {
		BeanA a = context.getBean("a2", BeanA.class);
		System.out.println(1 + " " + a);
		BeanB b = context.getBean(BeanB.class);
		System.out.println(2 + " " + b.getA());
		System.out.println(3 + " " + b);
	}
}
