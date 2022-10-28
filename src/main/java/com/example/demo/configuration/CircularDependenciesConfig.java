package com.example.demo.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;

import com.example.demo.bean.BeanA;
import com.example.demo.bean.BeanB;

public class CircularDependenciesConfig {

	@Bean("a1")
	BeanA beanA1() {
		BeanA a = new BeanA();
		return a;
	}

	@Bean("a2")
	BeanA beanA2() {
		BeanA a = new BeanA("Flower");
		return a;
	}

	@Bean("a3")
	BeanA beanA3() {
		BeanA a = new BeanA("Fake", 6);
		return a;
	}

	@Bean
	BeanB beanB(@Qualifier("a3") BeanA a) {
		BeanB b = new BeanB(a);
		return b;
	}
}
