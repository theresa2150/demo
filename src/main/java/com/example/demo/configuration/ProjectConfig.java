package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.bean.Person;
import com.example.demo.bean.Seaball;

@Configuration
@ComponentScan(basePackages = "com.example.demo.bean")
// prevent NoSuchBeanDefinitionException when auto-wiring
public class ProjectConfig {

	@Bean
	Person person() {
		Person person = new Person();
		person.setName("Willy");
//		person.setSeaball(new Seaball("1", "Kim"));
		return person;
	}

//	@Bean(name = "emily")
//	@Bean(value = "emily")
	@Bean("emily")
	Seaball seaball1() {
		Seaball seaball = new Seaball();
		seaball.setName("Emily");
		return seaball;
	}

//	@Primary // @Primary - default choice, prevent NoUniqueBeanDefinitionException
	@Bean // @Bean - Add beans to Spring context
	Seaball seaball2() {
		Seaball seaball = new Seaball();
		seaball.setName("Alan");
		return seaball;
	}

	@Bean
	Seaball seaball3() {
		Seaball seaball = new Seaball();
		seaball.setName("Andy");
		return seaball;
	}

	@Bean
	Seaball seaball4() {
		Seaball seaball = new Seaball();
		seaball.setName("Kevin");
		return seaball;
	}

	@Bean
	String helloworld() {
		return "hi";
	}

	@Bean
	int height() {
		return 10;
	}
}
