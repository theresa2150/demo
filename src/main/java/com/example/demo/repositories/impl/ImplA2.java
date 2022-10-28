package com.example.demo.repositories.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.example.demo.repositories.InterfaceA;

@Repository
@Qualifier("IA2")
public class ImplA2 implements InterfaceA {
//	@Override
	public void sendComment() {
		System.out.println("IA2 " + this.getClass().getSimpleName());
	}

	public ImplA2() {
		System.out.println("ImplA2 constructor");
	}
}
