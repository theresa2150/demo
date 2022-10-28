package com.example.demo.repositories.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.example.demo.repositories.InterfaceA;

@Repository
@Primary
@Qualifier("IA1")
public class ImplA1 implements InterfaceA {
//	@Override
	public void sendComment() {
		System.out.println("IA1 " + this.getClass().getSimpleName());
	}

	public ImplA1() {
		System.out.println("ImplA1 constructor");
	}
}
