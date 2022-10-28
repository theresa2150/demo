package com.example.demo.bean;

public class BeanB {

	private final BeanA a;
	private String name;

	public BeanB(BeanA a) {
		super();
		this.name = "Bob";
		this.a = a;
	}

	public BeanB() {
		super();
		this.name = "Hill";
		this.a = new BeanA("Tom");
	}

	public BeanA getA() {
		return a;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "BeanB [a=" + a + ", name=" + name + "]";
	}
}
