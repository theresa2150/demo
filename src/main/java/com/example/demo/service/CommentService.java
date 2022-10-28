package com.example.demo.service;

import java.util.logging.Logger;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.InterfaceA;
import com.example.demo.repositories.InterfaceB;
import com.example.demo.repositories.impl.ImplA2;
import com.example.demo.repositories.impl.ImplB;

@Lazy
@Service
public class CommentService {
	private final InterfaceA a;
	private final InterfaceB b;

	private Logger logger = Logger.getLogger(this.getClass().getName());

	public InterfaceA getA() {
		return a;
	}

	public InterfaceB getB() {
		return b;
	}

	public void publishComment() {
		logger.info("AA");
		a.sendComment();
		b.storeComment();
	}

	public CommentService(InterfaceA a, InterfaceB b) {
		this.a = a;
		this.b = b;
		System.out.println(this.getClass().getSimpleName()
				+ " instance created by constructor CommentService(InterfaceA a, InterfaceB b)!");
	}

	public CommentService() {
		this.a = new ImplA2();
		this.b = new ImplB();
		System.out.println(this.getClass().getSimpleName()
				+ " instance created by constructor CommentService()!");
	}
}
