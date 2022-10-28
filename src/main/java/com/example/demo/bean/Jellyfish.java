package com.example.demo.bean;

import org.springframework.stereotype.Component;

@Component
public class Jellyfish {
	private String num;
	private String name;

	public String getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public Jellyfish() {
		super();
		this.num = "5";
		this.name = "Elly";
	}

	public Jellyfish(String num, String name) {
		super();
		this.num = "6";
		this.name = "Elly2";
	}
}
