package com.example.demo.bean;

public class BeanA {

	private String name;
	private int num;

	public BeanA(String name) {
		super();
		this.name = name;
	}

	public BeanA(String name, int num) {
		this.name = name;
		this.num = num;
	}

	public BeanA() {
		this.name = "Tim";
		this.num = 2;
//		this.b = new BeanB("Banana");
	}

	@Override
	public String toString() {
		return "BeanA [name=" + name + ", num=" + num + "]";
	}
}
