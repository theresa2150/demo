package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

	@Autowired
	public Jellyfish jf;

	private String name;

	private final Seaball seaball;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Seaball getSeaball() {
		return seaball;
	}

	@Autowired
	public Person(String name, Seaball seaball) {
		this.name = name;
		this.seaball = seaball;
		System.out.println("ee");
	}

	public Person() {
		this.seaball = new Seaball("1", "Alex");
		System.out.println("ff");
	}
}
