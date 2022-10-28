package com.example.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;

import com.example.demo.repositories.InterfaceA;
import com.example.demo.repositories.InterfaceB;

public class UserService_DI {

	private InterfaceA a;

	private InterfaceB b;

	public InterfaceA getA() {
		return a;
	}

	public InterfaceB getB() {
		return b;
	}

	public void publishComment() {
		a.sendComment();
		b.storeComment();
	}

	public UserService_DI(@Qualifier("IA2") InterfaceA a, InterfaceB b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println(this.getClass().getSimpleName() + " instance created!");
	}
}
