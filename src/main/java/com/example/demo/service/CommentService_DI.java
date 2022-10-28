package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.repositories.InterfaceA;
import com.example.demo.repositories.InterfaceB;

@Service
public class CommentService_DI {

	private InterfaceA a;

	private InterfaceB b;

	private CommentService cs;

	public CommentService getCs() {
		return cs;
	}

	public InterfaceA getA() {
		return a;
	}

	public InterfaceB getB() {
		return b;
	}

	public void setB(InterfaceB b) {
		this.b = b;
	}

	public void publishComment() {
		a.sendComment();
		b.storeComment();
	}

	public CommentService_DI() {
		System.out.println(this.getClass().getSimpleName() + " instance created!");
	}

	public CommentService_DI(InterfaceA a, InterfaceB b) {
		this.a = a;
		this.b = b;
		this.cs = new CommentService();
		System.out.println("xx " + a.getClass().getSimpleName());
		System.out.println(this.getClass().getSimpleName() + " instance created!");
	}

	public CommentService_DI(InterfaceA a, InterfaceB b, CommentService cs) {
		this.a = a;
		this.b = b;
		this.cs = cs;
		System.out.println(this.getClass() + " instance created!");
	}
}
