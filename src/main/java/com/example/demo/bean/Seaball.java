package com.example.demo.bean;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Seaball {

	@PostConstruct
	public void init() {
		System.out.println("@PostConstruct name=" + this.getName());
	}

	private String num;
	private String name;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Seaball() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seaball(String num, String name) {
		super();
		this.num = num;
		this.name = name;
	}
}